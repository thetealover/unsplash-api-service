package org.api.unsplash.domain.imagemetadata.statistics.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ImageMetadataStatisticsHistoricalValue {
  public String date;
  public Integer value;
}
