package org.api.unsplash.domain.imagemetadata.usecase.get;

import com.naharoo.commons.mapstruct.MappingFacade;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.api.unsplash.adapter.in.api.imagemetadata.model.imagemetadata.ImageMetadataDto;
import org.api.unsplash.adapter.in.api.imagemetadata.model.imagemetadata.statistics.ImageMetadataStatisticsDto;
import org.api.unsplash.adapter.out.imagemetadata.client.unsplash.UnsplashImageMetadataApiClient;
import org.api.unsplash.adapter.out.imagemetadata.client.unsplash.UnsplashImageMetadataSearchResponseDto;
import org.api.unsplash.domain.imagemetadata.model.ImageColor;
import org.api.unsplash.domain.imagemetadata.model.ImageMetadata;
import org.api.unsplash.domain.imagemetadata.port.CreateImageMetadataPort;
import org.api.unsplash.domain.imagemetadata.statistics.model.ImageMetadataStatistics;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class GetAndPersistImagesMetadataFromUnsplashUseCase {
  private static final int ELEMENTS_PER_PAGE = 1000;
  private static final int PAGE = 0;
  private final MappingFacade mappingFacade;
  private final CreateImageMetadataPort createImageMetadataPort;
  private final UnsplashImageMetadataApiClient unsplashImageMetadataApiClient;

  public List<ImageMetadata> fetchAndPersistImagesMetadata(
      final String query, final ImageColor color) {

    final Mono<UnsplashImageMetadataSearchResponseDto> searchResult =
        unsplashImageMetadataApiClient.search(query, color, PAGE, ELEMENTS_PER_PAGE);

    final List<ImageMetadataDto> imageMetadataDtos =
        searchResult.map(UnsplashImageMetadataSearchResponseDto::getResults).block();

    final List<ImageMetadata> imageMetadatas =
        mappingFacade.mapAsList(imageMetadataDtos, ImageMetadata.class);

    imageMetadatas.forEach(
        imageMetadata -> {
          final ImageMetadataStatisticsDto statisticsDto =
              unsplashImageMetadataApiClient
                  .getImageMetadataStatistics(imageMetadata.getId())
                  .block();
          final ImageMetadataStatistics statistics =
              mappingFacade.map(statisticsDto, ImageMetadataStatistics.class);

          imageMetadata.setStatistics(statistics);
        });

    createImageMetadataPort.createAll(imageMetadatas).subscribe();

    return imageMetadatas;
  }
}
