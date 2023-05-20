package org.api.unsplash.domain.tag.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TagSource {
  private TagSlugMetadata type;
  private TagSlugMetadata category;
  private TagSlugMetadata subcategory;
  private String title;
  private String subtitle;
  private String description;
  private String metaTitle;
  private String metaDescription;
}
