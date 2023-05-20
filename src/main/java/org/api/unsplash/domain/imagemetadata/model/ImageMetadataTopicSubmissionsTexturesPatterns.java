package org.api.unsplash.domain.imagemetadata.model;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document
public class ImageMetadataTopicSubmissionsTexturesPatterns {
  private String status;
  private LocalDateTime approvedOn;
}
