package org.api.unsplash.adapter.out.imagemetadata.persistence;

import java.util.Collection;
import lombok.RequiredArgsConstructor;
import org.api.unsplash.domain.imagemetadata.model.ImageMetadata;
import org.api.unsplash.domain.imagemetadata.port.CreateImageMetadataPort;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;

@Repository
@Transactional
@RequiredArgsConstructor
public class ImageMetadataPersistenceAdapter implements CreateImageMetadataPort {
  private final ImageMetadataRepository imageMetadataRepository;

  @Override
  public Flux<ImageMetadata> createAll(final Collection<ImageMetadata> imagesMetadata) {
    return imageMetadataRepository.saveAll(imagesMetadata);
  }
}
