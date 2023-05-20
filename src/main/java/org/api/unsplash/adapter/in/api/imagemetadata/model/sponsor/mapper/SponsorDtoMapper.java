package org.api.unsplash.adapter.in.api.imagemetadata.model.sponsor.mapper;

import com.naharoo.commons.mapstruct.BidirectionalMapper;
import org.api.unsplash.adapter.in.api.imagemetadata.model.sponsor.SponsorDto;
import org.api.unsplash.domain.sponsor.model.Sponsor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SponsorDtoMapper extends BidirectionalMapper<SponsorDto, Sponsor> {
  @Override
  Sponsor map(SponsorDto source);

  @Override
  SponsorDto mapReverse(Sponsor destination);
}
