package org.api.unsplash.adapter.in.api.imagemetadata.model.link.mapper;

import com.naharoo.commons.mapstruct.BidirectionalMapper;
import org.api.unsplash.adapter.in.api.imagemetadata.model.link.LinksDto;
import org.api.unsplash.domain.links.model.Links;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LinksDtoMapper extends BidirectionalMapper<LinksDto, Links> {
  @Override
  Links map(LinksDto source);

  @Override
  LinksDto mapReverse(Links destination);
}
