package org.api.unsplash.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "unsplash")
public class UnsplashApiApplicationProperties {
  private String unsplashApiBaseUrl;
  private String unsplashApiAccessKey;
}
