package org.api.unsplash.adapter.in.api.imagemetadata.model.imagemetadata.statistics.mapper;

import com.naharoo.commons.mapstruct.BidirectionalMapper;
import org.api.unsplash.adapter.in.api.imagemetadata.model.imagemetadata.statistics.ImageMetadataStatisticsPayloadDto;
import org.api.unsplash.domain.imagemetadata.statistics.model.ImageMetadataStatisticsPayload;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = ImageMetadataStatisticsHistoricalDtoMapper.class)
public interface ImageMetadataStatisticsPayloadDtoMapper
    extends BidirectionalMapper<ImageMetadataStatisticsPayloadDto, ImageMetadataStatisticsPayload> {
  @Override
  ImageMetadataStatisticsPayload map(ImageMetadataStatisticsPayloadDto source);

  @Override
  ImageMetadataStatisticsPayloadDto mapReverse(ImageMetadataStatisticsPayload destination);
}
