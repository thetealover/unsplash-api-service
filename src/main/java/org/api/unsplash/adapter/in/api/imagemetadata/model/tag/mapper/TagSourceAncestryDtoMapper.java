package org.api.unsplash.adapter.in.api.imagemetadata.model.tag.mapper;

import com.naharoo.commons.mapstruct.BidirectionalMapper;
import org.api.unsplash.adapter.in.api.imagemetadata.model.tag.TagSourceAncestryDto;
import org.api.unsplash.domain.tag.model.TagSourceAncestry;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = TagSlugMetadataDtoMapper.class)
public interface TagSourceAncestryDtoMapper
    extends BidirectionalMapper<TagSourceAncestryDto, TagSourceAncestry> {
  @Override
  TagSourceAncestry map(TagSourceAncestryDto source);

  @Override
  TagSourceAncestryDto mapReverse(TagSourceAncestry destination);
}
