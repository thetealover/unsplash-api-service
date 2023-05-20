package org.api.unsplash.domain.sponsor.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Sponsor {
  private String id;
  private String updatedAt;
  private String username;
  private String name;
  private String firstName;
  private String lastName;
  private String twitterUsername;
  private String portfolioUrl;
  private String bio;
}
