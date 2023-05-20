package org.api.unsplash.domain.imagemetadata.statistics.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ImageMetadataStatistics {
  public String id;
  public String slug;
  public ImageMetadataStatisticsPayload downloads;
  public ImageMetadataStatisticsPayload views;
  public ImageMetadataStatisticsPayload likes;
}
