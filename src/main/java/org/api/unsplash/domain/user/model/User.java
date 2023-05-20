package org.api.unsplash.domain.user.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.api.unsplash.domain.image.Image;
import org.api.unsplash.domain.links.model.Links;
import org.api.unsplash.domain.socialdata.model.SocialData;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
  private String id;
  private String updatedAt;
  private String username;
  private String name;
  private String firstName;
  private String lastName;
  private String twitterUsername;
  private String portfolioUrl;
  private String bio;
  private String location;
  private Links links;
  private Image profileImage;
  private String instagramUsername;
  private Integer totalCollections;
  private Integer totalLikes;
  private Integer totalPhotos;
  private Boolean acceptedTos;
  private Boolean forHire;
  private SocialData social;
}
