package org.api.unsplash.adapter.in.api.imagemetadata.model.sponsorship.mapper;

import com.naharoo.commons.mapstruct.BidirectionalMapper;
import org.api.unsplash.adapter.in.api.imagemetadata.model.sponsorship.SponsorshipDto;
import org.api.unsplash.domain.sponsorship.model.Sponsorship;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SponsorshipDtoMapper extends BidirectionalMapper<SponsorshipDto, Sponsorship> {
  @Override
  Sponsorship map(SponsorshipDto source);

  @Override
  SponsorshipDto mapReverse(Sponsorship destination);
}
