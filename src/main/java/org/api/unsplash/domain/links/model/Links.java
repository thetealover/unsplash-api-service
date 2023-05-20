package org.api.unsplash.domain.links.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Links {
  private String self;
  private String html;
  private String photos;
  private String likes;
  private String portfolio;
  private String following;
  private String followers;
  private String download;
  private String downloadLocation;
}
