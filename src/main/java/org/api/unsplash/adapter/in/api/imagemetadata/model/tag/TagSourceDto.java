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
public class TagSourceDto {
  @JsonProperty("type")
  private TagSlugMetadataDto type;

  @JsonProperty("category")
  private TagSlugMetadataDto category;

  @JsonProperty("subcategory")
  private TagSlugMetadataDto subcategory;

  @JsonProperty("title")
  private String title;

  @JsonProperty("subtitle")
  private String subtitle;

  @JsonProperty("description")
  private String description;

  @JsonProperty("meta_title")
  private String metaTitle;

  @JsonProperty("meta_description")
  private String metaDescription;
}
