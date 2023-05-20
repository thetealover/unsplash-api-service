package org.api.unsplash.domain.imagemetadata.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ImageColor {
  BLACK_AND_WHITE("black_and_white"),
  RED("red"),
  BLUE("blue");

  @Getter private final String value;
}
