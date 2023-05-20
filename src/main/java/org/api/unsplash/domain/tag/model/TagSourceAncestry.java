package org.api.unsplash.domain.tag.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TagSourceAncestry {
  private TagSlugMetadata type;
}
