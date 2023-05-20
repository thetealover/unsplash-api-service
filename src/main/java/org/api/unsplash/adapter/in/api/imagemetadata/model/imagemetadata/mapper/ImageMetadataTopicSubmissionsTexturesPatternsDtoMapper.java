package org.api.unsplash.adapter.in.api.imagemetadata.model.imagemetadata.mapper;

import com.naharoo.commons.mapstruct.BidirectionalMapper;
import org.api.unsplash.adapter.in.api.imagemetadata.model.imagemetadata.ImageMetadataTopicSubmissionsTexturesPatternsDto;
import org.api.unsplash.domain.imagemetadata.model.ImageMetadataTopicSubmissionsTexturesPatterns;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ImageMetadataTopicSubmissionsTexturesPatternsDtoMapper
    extends BidirectionalMapper<
        ImageMetadataTopicSubmissionsTexturesPatternsDto,
        ImageMetadataTopicSubmissionsTexturesPatterns> {
  @Override
  ImageMetadataTopicSubmissionsTexturesPatterns map(
      ImageMetadataTopicSubmissionsTexturesPatternsDto source);

  @Override
  ImageMetadataTopicSubmissionsTexturesPatternsDto mapReverse(
      ImageMetadataTopicSubmissionsTexturesPatterns destination);
}
