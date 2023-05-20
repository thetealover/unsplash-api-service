package org.api.unsplash.domain.imagemetadata.model;

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
public class ImageMetadataTopicSubmissions {
  private ImageMetadataTopicSubmissionsTexturesPatterns topicSubmissions;
}
