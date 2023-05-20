package org.api.unsplash.adapter.in.api.imagemetadata.model.imagemetadata.statistics.mapper;

import com.naharoo.commons.mapstruct.BidirectionalMapper;
import org.api.unsplash.adapter.in.api.imagemetadata.model.imagemetadata.statistics.ImageMetadataStatisticsHistoricalValueDto;
import org.api.unsplash.domain.imagemetadata.statistics.model.ImageMetadataStatisticsHistoricalValue;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ImageMetadataStatisticsHistoricalValueDtoMapper
    extends BidirectionalMapper<
        ImageMetadataStatisticsHistoricalValueDto, ImageMetadataStatisticsHistoricalValue> {
  @Override
  ImageMetadataStatisticsHistoricalValue map(ImageMetadataStatisticsHistoricalValueDto source);

  @Override
  ImageMetadataStatisticsHistoricalValueDto mapReverse(
      ImageMetadataStatisticsHistoricalValue destination);
}
