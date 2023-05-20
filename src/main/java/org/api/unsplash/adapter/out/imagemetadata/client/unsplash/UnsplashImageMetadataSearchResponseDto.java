package org.api.unsplash.adapter.out.imagemetadata.client.unsplash;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.api.unsplash.adapter.in.api.imagemetadata.model.imagemetadata.ImageMetadataDto;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UnsplashImageMetadataSearchResponseDto {
  @JsonProperty("total")
  private Integer total;

  @JsonProperty("total_pages")
  private Integer totalPages;

  @JsonProperty("results")
  private List<ImageMetadataDto> results;
}
