package org.api.unsplash.adapter.in.api.imagemetadata.model.imagemetadata.mapper;

import com.naharoo.commons.mapstruct.BidirectionalMapper;
import org.api.unsplash.adapter.in.api.imagemetadata.model.image.mapper.ImageDtoMapper;
import org.api.unsplash.adapter.in.api.imagemetadata.model.imagemetadata.ImageMetadataDto;
import org.api.unsplash.adapter.in.api.imagemetadata.model.imagemetadata.statistics.mapper.ImageMetadataStatisticsDtoMapper;
import org.api.unsplash.adapter.in.api.imagemetadata.model.link.mapper.LinksDtoMapper;
import org.api.unsplash.adapter.in.api.imagemetadata.model.socialdata.mapper.SocialDataDtoMapper;
import org.api.unsplash.adapter.in.api.imagemetadata.model.sponsor.mapper.SponsorDtoMapper;
import org.api.unsplash.adapter.in.api.imagemetadata.model.sponsorship.mapper.SponsorshipDtoMapper;
import org.api.unsplash.adapter.in.api.imagemetadata.model.tag.mapper.TagDtoMapper;
import org.api.unsplash.adapter.in.api.imagemetadata.model.url.mapper.UrlsDtoMapper;
import org.api.unsplash.adapter.in.api.imagemetadata.model.user.mapper.UserDtoMapper;
import org.api.unsplash.domain.imagemetadata.model.ImageMetadata;
import org.mapstruct.Mapper;

@Mapper(
    componentModel = "spring",
    uses = {
      ImageMetadataTopicSubmissionsDtoMapper.class,
      UrlsDtoMapper.class,
      LinksDtoMapper.class,
      SponsorshipDtoMapper.class,
      SponsorDtoMapper.class,
      ImageDtoMapper.class,
      SocialDataDtoMapper.class,
      ImageMetadataTopicSubmissionsDtoMapper.class,
      UserDtoMapper.class,
      TagDtoMapper.class,
      ImageMetadataStatisticsDtoMapper.class
    })
public interface ImageMetadataDtoMapper
    extends BidirectionalMapper<ImageMetadataDto, ImageMetadata> {
  @Override
  ImageMetadata map(ImageMetadataDto source);

  @Override
  ImageMetadataDto mapReverse(ImageMetadata destination);
}
