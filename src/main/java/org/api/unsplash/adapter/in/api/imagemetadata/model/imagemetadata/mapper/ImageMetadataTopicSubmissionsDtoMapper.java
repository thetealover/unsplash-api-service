package org.api.unsplash.adapter.in.api.imagemetadata.model.imagemetadata.mapper;

import com.naharoo.commons.mapstruct.BidirectionalMapper;
import org.api.unsplash.adapter.in.api.imagemetadata.model.imagemetadata.ImagesMetadataTopicSubmissionsDto;
import org.api.unsplash.domain.imagemetadata.model.ImageMetadataTopicSubmissions;
import org.mapstruct.Mapper;

@Mapper(
    componentModel = "spring",
    uses = ImageMetadataTopicSubmissionsTexturesPatternsDtoMapper.class)
public interface ImageMetadataTopicSubmissionsDtoMapper
    extends BidirectionalMapper<ImagesMetadataTopicSubmissionsDto, ImageMetadataTopicSubmissions> {
  @Override
  ImageMetadataTopicSubmissions map(ImagesMetadataTopicSubmissionsDto source);

  @Override
  ImagesMetadataTopicSubmissionsDto mapReverse(ImageMetadataTopicSubmissions destination);
}
