package org.api.unsplash.adapter.in.api.imagemetadata.model.tag;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.api.unsplash.adapter.in.api.imagemetadata.model.imagemetadata.ImageMetadataDto;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TagDto {
  @JsonProperty("type")
  private String type;

  @JsonProperty("title")
  private String title;

  @JsonProperty("source")
  private TagSourceDto source;

  @JsonProperty("cover_photo")
  private ImageMetadataDto coverPhoto;
}
