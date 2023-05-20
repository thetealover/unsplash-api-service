package org.api.unsplash.adapter.in.api.imagemetadata.model.tag.mapper;

import com.naharoo.commons.mapstruct.BidirectionalMapper;
import org.api.unsplash.adapter.in.api.imagemetadata.model.tag.TagSlugMetadataDto;
import org.api.unsplash.domain.tag.model.TagSlugMetadata;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TagSlugMetadataDtoMapper
    extends BidirectionalMapper<TagSlugMetadataDto, TagSlugMetadata> {
  @Override
  TagSlugMetadata map(TagSlugMetadataDto source);

  @Override
  TagSlugMetadataDto mapReverse(TagSlugMetadata destination);
}
