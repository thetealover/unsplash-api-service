package org.api.unsplash.adapter.in.api.imagemetadata.model.imagemetadata.statistics;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ImageMetadataStatisticsPayloadDto {
  public Integer total;
  public ImageMetadataStatisticsHistoricalDto historical;
}
