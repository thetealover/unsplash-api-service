package org.api.unsplash.adapter.in.api.imagemetadata.model.imagemetadata.statistics;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ImageMetadataStatisticsHistoricalValueDto {
  public String date;
  public Integer value;
}
