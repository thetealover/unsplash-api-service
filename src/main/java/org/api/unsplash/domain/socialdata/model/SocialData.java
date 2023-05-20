package org.api.unsplash.domain.socialdata.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SocialData {
  private String instagramUsername;
  private String portfolioUrl;
  private String twitterUsername;
  private String paypalEmail;
}
