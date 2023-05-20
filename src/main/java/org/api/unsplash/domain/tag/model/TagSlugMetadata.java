package org.api.unsplash.domain.tag.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TagSlugMetadata {
  private String slug;
  private String prettySlug;
}
