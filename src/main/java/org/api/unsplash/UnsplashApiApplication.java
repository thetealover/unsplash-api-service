package org.api.unsplash;

import org.api.unsplash.config.UnsplashApiApplicationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = UnsplashApiApplicationProperties.class)
public class UnsplashApiApplication {
  public static void main(String[] args) {
    SpringApplication.run(UnsplashApiApplication.class, args);
  }
}
