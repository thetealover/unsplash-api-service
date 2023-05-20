package org.api.unsplash.adapter.in.api.imagemetadata.model.url.mapper;

import com.naharoo.commons.mapstruct.BidirectionalMapper;
import org.api.unsplash.adapter.in.api.imagemetadata.model.url.UrlsDto;
import org.api.unsplash.domain.url.model.Urls;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UrlsDtoMapper extends BidirectionalMapper<UrlsDto, Urls> {
  @Override
  Urls map(UrlsDto source);

  @Override
  UrlsDto mapReverse(Urls destination);
}
