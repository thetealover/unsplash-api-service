package org.api.unsplash.domain.imagemetadata.usecase.get;

import com.naharoo.commons.mapstruct.MappingFacade;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.api.unsplash.adapter.out.imagemetadata.client.unsplash.UnsplashImageMetadataApiClient;
import org.api.unsplash.domain.imagemetadata.model.ImageColor;
import org.api.unsplash.domain.imagemetadata.model.ImageMetadata;
import org.api.unsplash.domain.imagemetadata.port.CreateImageMetadataPort;
import org.api.unsplash.domain.imagemetadata.statistics.model.ImageMetadataStatistics;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class GetAndPersistImagesMetadataFromUnsplashUseCase {
  private final MappingFacade mappingFacade;
  private final CreateImageMetadataPort createImageMetadataPort;
  private final UnsplashImageMetadataApiClient unsplashImageMetadataApiClient;

  public Mono<List<ImageMetadata>> getAndPersistImagesMetadata(
      final String query, final ImageColor color, final int page, final int elements) {
    return unsplashImageMetadataApiClient
        .search(query, color, page, elements)
        .flatMapMany(searchResponse -> Flux.fromIterable(searchResponse.getResults()))
        .flatMap(
            imageMetadataDto -> {
              final ImageMetadata imageMetadata =
                  mappingFacade.map(imageMetadataDto, ImageMetadata.class);
              return unsplashImageMetadataApiClient
                  .getImageMetadataStatistics(imageMetadata.getId())
                  .map(
                      statisticsDto ->
                          mappingFacade.map(statisticsDto, ImageMetadataStatistics.class))
                  .doOnNext(imageMetadata::setStatistics)
                  .thenReturn(imageMetadata);
            })
        .collectList()
        .flatMap(
            imagesMetadata ->
                createImageMetadataPort.createAll(imagesMetadata).then(Mono.just(imagesMetadata)));
  }
}
