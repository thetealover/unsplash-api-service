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
public class TagSourceAncestryDto {
  @JsonProperty("type")
  private TagSlugMetadataDto type;
}
