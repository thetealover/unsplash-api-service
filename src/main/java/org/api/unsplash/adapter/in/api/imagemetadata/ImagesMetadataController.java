package org.api.unsplash.adapter.in.api.imagemetadata;

import com.naharoo.commons.mapstruct.MappingFacade;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.api.unsplash.adapter.in.api.imagemetadata.model.imagemetadata.ImageMetadataDto;
import org.api.unsplash.domain.imagemetadata.model.ImageColor;
import org.api.unsplash.domain.imagemetadata.usecase.get.GetAndPersistImagesMetadataFromUnsplashUseCase;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
public class ImagesMetadataController {

  private final MappingFacade mappingFacade;
  private final GetAndPersistImagesMetadataFromUnsplashUseCase
      getAndPersistImagesMetadataFromUnsplashUseCase;

  @GetMapping("/images")
  public Mono<List<ImageMetadataDto>> getImagesMetadata(
      @Parameter(description = "Keyword for desired images", required = true)
          @RequestParam(value = "query", required = false)
          final @NotBlank String query,
      @Parameter(description = "Desired image color", required = true)
          @RequestParam(value = "color", required = false)
          final @NotNull ImageColor color,
      @RequestParam(value = "page", required = false) final @NotNull @Min(0) Integer page,
      @RequestParam(value = "elements", required = false)
          final @NotNull @Min(0) @Max(10) Integer elements) {
    log.debug(
        "Getting image/s metadata for query={}, color={}. Page={}, elements count per page={}",
        query,
        color,
        page,
        elements);

    return getAndPersistImagesMetadataFromUnsplashUseCase
        .getAndPersistImagesMetadata(query, color, page, elements)
        .map(imagesMetadata -> mappingFacade.mapAsList(imagesMetadata, ImageMetadataDto.class))
        .doOnNext(
            response ->
                log.info(
                    "Successfully got metadata for image/s for requested query={}, color={}. Page={}, elements count per page={}, total elements={}",
                    query,
                    color,
                    page,
                    elements,
                    response.size()));
  }
}
