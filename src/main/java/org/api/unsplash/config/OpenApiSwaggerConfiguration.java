package org.api.unsplash.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class OpenApiSwaggerConfiguration {
  private final UnsplashApiApplicationProperties properties;

  @Bean
  public OpenAPI openApiDefinition() {
    return new OpenAPI()
        .servers(List.of(new Server().url("/")))
        .info(
            new Info()
                .title("Unsplash API web service")
                .description(
                    "A reactive stack running WS for fetching & persisting images metadata from Unsplash")
                .version(properties.getAppVersion()));
  }
}
