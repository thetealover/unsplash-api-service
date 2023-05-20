package org.api.unsplash.domain.url.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Urls {
  private String raw;
  private String full;
  private String regular;
  private String small;
  private String thumb;
  private String smallS3;
}
