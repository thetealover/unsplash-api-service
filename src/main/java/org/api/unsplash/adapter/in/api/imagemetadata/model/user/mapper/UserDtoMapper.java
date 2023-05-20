package org.api.unsplash.adapter.in.api.imagemetadata.model.user.mapper;

import com.naharoo.commons.mapstruct.BidirectionalMapper;
import org.api.unsplash.adapter.in.api.imagemetadata.model.image.mapper.ImageDtoMapper;
import org.api.unsplash.adapter.in.api.imagemetadata.model.link.mapper.LinksDtoMapper;
import org.api.unsplash.adapter.in.api.imagemetadata.model.socialdata.mapper.SocialDataDtoMapper;
import org.api.unsplash.adapter.in.api.imagemetadata.model.user.UserDto;
import org.api.unsplash.domain.user.model.User;
import org.mapstruct.Mapper;

@Mapper(
    componentModel = "spring",
    uses = {LinksDtoMapper.class, ImageDtoMapper.class, SocialDataDtoMapper.class})
public interface UserDtoMapper extends BidirectionalMapper<UserDto, User> {
  @Override
  User map(UserDto source);

  @Override
  UserDto mapReverse(User destination);
}
