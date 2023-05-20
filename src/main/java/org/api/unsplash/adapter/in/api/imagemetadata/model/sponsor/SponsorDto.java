package org.api.unsplash.adapter.in.api.imagemetadata.model.sponsor;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SponsorDto {
  @JsonProperty("id")
  private String id;

  @JsonProperty("updated_at")
  private String updatedAt;

  @JsonProperty("username")
  private String username;

  @JsonProperty("name")
  private String name;

  @JsonProperty("first_name")
  private String firstName;

  @JsonProperty("last_name")
  private String lastName;

  @JsonProperty("twitter_username")
  private String twitterUsername;

  @JsonProperty("portfolio_url")
  private String portfolioUrl;

  @JsonProperty("bio")
  private String bio;
}
