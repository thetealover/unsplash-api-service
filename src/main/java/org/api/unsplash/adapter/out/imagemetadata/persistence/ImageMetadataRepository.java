package org.api.unsplash.adapter.out.imagemetadata.persistence;

import org.api.unsplash.domain.imagemetadata.model.ImageMetadata;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ImageMetadataRepository extends ReactiveCrudRepository<ImageMetadata, String> {}
