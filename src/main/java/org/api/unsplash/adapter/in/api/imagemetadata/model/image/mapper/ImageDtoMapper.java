package org.api.unsplash.adapter.in.api.imagemetadata.model.image.mapper;

import com.naharoo.commons.mapstruct.BidirectionalMapper;
import org.api.unsplash.adapter.in.api.imagemetadata.model.image.ImageDto;
import org.api.unsplash.domain.image.Image;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ImageDtoMapper extends BidirectionalMapper<ImageDto, Image> {
  @Override
  Image map(ImageDto source);

  @Override
  ImageDto mapReverse(Image destination);
}
