package org.api.unsplash.adapter.in.api.imagemetadata.model.imagemetadata.statistics.mapper;

import com.naharoo.commons.mapstruct.BidirectionalMapper;
import org.api.unsplash.adapter.in.api.imagemetadata.model.imagemetadata.statistics.ImageMetadataStatisticsDto;
import org.api.unsplash.domain.imagemetadata.statistics.model.ImageMetadataStatistics;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ImageMetadataStatisticsDtoMapper
    extends BidirectionalMapper<ImageMetadataStatisticsDto, ImageMetadataStatistics> {
  @Override
  ImageMetadataStatistics map(ImageMetadataStatisticsDto source);

  @Override
  ImageMetadataStatisticsDto mapReverse(ImageMetadataStatistics destination);
}
