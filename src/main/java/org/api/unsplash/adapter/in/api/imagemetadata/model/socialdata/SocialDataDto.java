package org.api.unsplash.adapter.in.api.imagemetadata.model.socialdata;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SocialDataDto {
  @JsonProperty("instagram_username")
  private String instagramUsername;

  @JsonProperty("portfolio_url")
  private String portfolioUrl;

  @JsonProperty("twitter_username")
  private String twitterUsername;

  @JsonProperty("paypal_email")
  private String paypalEmail;
}
