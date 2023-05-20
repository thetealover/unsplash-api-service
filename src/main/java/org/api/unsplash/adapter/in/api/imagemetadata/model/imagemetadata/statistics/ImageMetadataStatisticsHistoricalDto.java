package org.api.unsplash.adapter.in.api.imagemetadata.model.imagemetadata.statistics;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ImageMetadataStatisticsHistoricalDto {
  public Integer change;
  public String resolution;
  public Integer quantity;
  public List<ImageMetadataStatisticsHistoricalValueDto> values;
}
