package org.api.unsplash.adapter.in.api.imagemetadata.model.imagemetadata.statistics.mapper;

import com.naharoo.commons.mapstruct.BidirectionalMapper;
import org.api.unsplash.adapter.in.api.imagemetadata.model.imagemetadata.statistics.ImageMetadataStatisticsHistoricalDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = ImageMetadataStatisticsHistoricalValueDtoMapper.class)
public interface ImageMetadataStatisticsHistoricalDtoMapper
    extends BidirectionalMapper<
        ImageMetadataStatisticsHistoricalDto, ImageMetadataStatisticsHistoricalDto> {
  @Override
  ImageMetadataStatisticsHistoricalDto map(ImageMetadataStatisticsHistoricalDto source);

  @Override
  ImageMetadataStatisticsHistoricalDto mapReverse(ImageMetadataStatisticsHistoricalDto destination);
}
