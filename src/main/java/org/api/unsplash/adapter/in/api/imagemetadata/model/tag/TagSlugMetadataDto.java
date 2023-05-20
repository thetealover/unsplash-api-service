package org.api.unsplash.adapter.in.api.imagemetadata.model.tag;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TagSlugMetadataDto {
  @JsonProperty("slug")
  private String slug;

  @JsonProperty("pretty_slug")
  private String prettySlug;
}
