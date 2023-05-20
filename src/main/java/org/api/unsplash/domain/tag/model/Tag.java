package org.api.unsplash.domain.tag.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.api.unsplash.domain.imagemetadata.model.ImageMetadata;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Tag {
  private String type;
  private String title;
  private TagSource source;
  private ImageMetadata coverPhoto;
}
