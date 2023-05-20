package org.api.unsplash.domain.imagemetadata.port;

import java.util.Collection;
import org.api.unsplash.domain.imagemetadata.model.ImageMetadata;
import reactor.core.publisher.Flux;

public interface CreateImageMetadataPort {
  Flux<ImageMetadata> createAll(Collection<ImageMetadata> imagesMetadata);
}
