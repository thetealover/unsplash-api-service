package org.api.unsplash.adapter.in.api.imagemetadata.model.socialdata.mapper;

import com.naharoo.commons.mapstruct.BidirectionalMapper;
import org.api.unsplash.adapter.in.api.imagemetadata.model.socialdata.SocialDataDto;
import org.api.unsplash.domain.socialdata.model.SocialData;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SocialDataDtoMapper extends BidirectionalMapper<SocialDataDto, SocialData> {
  @Override
  SocialData map(SocialDataDto source);

  @Override
  SocialDataDto mapReverse(SocialData destination);
}
