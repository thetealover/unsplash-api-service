package org.api.unsplash.adapter.in.api.imagemetadata;

import com.naharoo.commons.mapstruct.MappingFacade;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.api.unsplash.adapter.in.api.imagemetadata.model.imagemetadata.ImageMetadataDto;
import org.api.unsplash.domain.imagemetadata.model.ImageColor;
import org.api.unsplash.domain.imagemetadata.model.ImageMetadata;
import org.api.unsplash.domain.imagemetadata.usecase.get.GetAndPersistImagesMetadataFromUnsplashUseCase;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
public class ImagesMetadataController {

  private final MappingFacade mappingFacade;
  private final GetAndPersistImagesMetadataFromUnsplashUseCase
      getAndPersistImagesMetadataFromUnsplashUseCase;

  @GetMapping("/images")
  public List<ImageMetadataDto> getImagesMetadata(
      @RequestParam(value = "query", required = false) final @NotBlank String query,
      @RequestParam(value = "color", required = false) final @NotNull ImageColor color) {
    log.debug("Getting image/s metadata for color={}", color);

    final List<ImageMetadata> imagesMetadata =
        getAndPersistImagesMetadataFromUnsplashUseCase.fetchAndPersistImagesMetadata(query, color);
    final List<ImageMetadataDto> response =
        mappingFacade.mapAsList(imagesMetadata, ImageMetadataDto.class);

    log.info(
        "Successfully got metadata for image/s for requested color={}, total elements={}",
        color,
        response.size());
    return response;
  }
}
