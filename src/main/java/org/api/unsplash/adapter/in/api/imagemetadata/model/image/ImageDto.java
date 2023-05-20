package org.api.unsplash.adapter.in.api.imagemetadata.model.image;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ImageDto {
  private String small;
  private String medium;
  private String large;
}
