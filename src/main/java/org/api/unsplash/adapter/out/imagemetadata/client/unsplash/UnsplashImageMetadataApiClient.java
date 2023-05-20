package org.api.unsplash.adapter.out.imagemetadata.client.unsplash;

import org.api.unsplash.adapter.in.api.imagemetadata.model.imagemetadata.statistics.ImageMetadataStatisticsDto;
import org.api.unsplash.config.UnsplashApiApplicationProperties;
import org.api.unsplash.domain.imagemetadata.model.ImageColor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class UnsplashImageMetadataApiClient {

  private static final String PHOTOS_SEARCH_PATH = "/search/photos";
  private static final String CLIENT_ID_PARAM = "client_id";
  private static final String QUERY_PARAM = "query";
  private static final String COLOR_PARAM = "color";
  private static final String PAGE_PARAM = "page";
  private static final String PER_PAGE_PARAM = "per_page";
  public static final String PHOTOS_PATH_PARAM = "photos";
  public static final String STATISTICS_PATH_PARAM = "statistics";

  private final UnsplashApiApplicationProperties properties;

  private final WebClient webClient;

  public UnsplashImageMetadataApiClient(final UnsplashApiApplicationProperties properties) {
    this.properties = properties;
    this.webClient =
        WebClient.builder()
            .baseUrl(properties.getUnsplashApiBaseUrl())
            .codecs(configurer -> configurer.defaultCodecs().maxInMemorySize(16 * 1024 * 1024))
            .build();
  }

  public Mono<UnsplashImageMetadataSearchResponseDto> search(
      final String query, final ImageColor color, final int page, final int elementsPerPage) {
    return webClient
        .get()
        .uri(
            uriBuilder ->
                uriBuilder
                    .path(PHOTOS_SEARCH_PATH)
                    .queryParam(CLIENT_ID_PARAM, properties.getUnsplashApiAccessKey())
                    .queryParam(QUERY_PARAM, query)
                    .queryParam(COLOR_PARAM, color.getValue())
                    .queryParam(PAGE_PARAM, page)
                    .queryParam(PER_PAGE_PARAM, elementsPerPage)
                    .build())
        .retrieve()
        .bodyToMono(UnsplashImageMetadataSearchResponseDto.class);
  }

  public Mono<ImageMetadataStatisticsDto> getImageMetadataStatistics(final String imageId) {
    return webClient
        .get()
        .uri(
            uriBuilder ->
                uriBuilder
                    .path(PHOTOS_PATH_PARAM)
                    .pathSegment(imageId)
                    .pathSegment(STATISTICS_PATH_PARAM)
                    .queryParam(CLIENT_ID_PARAM, properties.getUnsplashApiAccessKey())
                    .build())
        .retrieve()
        .bodyToMono(ImageMetadataStatisticsDto.class);
  }
}
