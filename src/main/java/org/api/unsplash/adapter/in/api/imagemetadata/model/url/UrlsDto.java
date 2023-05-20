package org.api.unsplash.adapter.in.api.imagemetadata.model.url;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UrlsDto {
  @JsonProperty("raw")
  private String raw;

  @JsonProperty("full")
  private String full;

  @JsonProperty("regular")
  private String regular;

  @JsonProperty("small")
  private String small;

  @JsonProperty("thumb")
  private String thumb;

  @JsonProperty("small_s3")
  private String smallS3;
}
