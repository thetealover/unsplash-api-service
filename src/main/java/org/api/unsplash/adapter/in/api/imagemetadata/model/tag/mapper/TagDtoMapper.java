package org.api.unsplash.adapter.in.api.imagemetadata.model.tag.mapper;

import com.naharoo.commons.mapstruct.BidirectionalMapper;
import org.api.unsplash.adapter.in.api.imagemetadata.model.tag.TagSourceDto;
import org.api.unsplash.domain.tag.model.TagSource;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = TagSlugMetadataDtoMapper.class)
public interface TagDtoMapper extends BidirectionalMapper<TagSourceDto, TagSource> {
  @Override
  TagSource map(TagSourceDto source);

  @Override
  TagSourceDto mapReverse(TagSource destination);
}
