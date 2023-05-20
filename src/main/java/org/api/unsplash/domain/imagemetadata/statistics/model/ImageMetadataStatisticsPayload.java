package org.api.unsplash.domain.imagemetadata.statistics.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ImageMetadataStatisticsPayload {
  public Integer total;
  public ImageMetadataStatisticsHistorical historical;
}
