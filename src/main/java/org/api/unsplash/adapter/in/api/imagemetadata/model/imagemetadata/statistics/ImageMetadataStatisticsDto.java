package org.api.unsplash.adapter.in.api.imagemetadata.model.imagemetadata.statistics;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ImageMetadataStatisticsDto {
  public String id;
  public String slug;
  public ImageMetadataStatisticsPayloadDto downloads;
  public ImageMetadataStatisticsPayloadDto views;
  public ImageMetadataStatisticsPayloadDto likes;
}
