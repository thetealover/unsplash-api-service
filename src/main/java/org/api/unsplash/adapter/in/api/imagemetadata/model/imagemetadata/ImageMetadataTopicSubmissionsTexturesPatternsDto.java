package org.api.unsplash.adapter.in.api.imagemetadata.model.imagemetadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ImageMetadataTopicSubmissionsTexturesPatternsDto {
  @JsonProperty("status")
  private String status;

  @JsonProperty("approved_on")
  private LocalDateTime approvedOn;
}
