package org.api.unsplash.adapter.in.api.imagemetadata.model.sponsorship;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SponsorshipDto {
  @JsonProperty("impression_urls")
  private List<String> impressionUrls;
}
