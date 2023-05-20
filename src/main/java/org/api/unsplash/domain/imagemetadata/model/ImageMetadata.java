package org.api.unsplash.domain.imagemetadata.model;

import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.api.unsplash.domain.image.Image;
import org.api.unsplash.domain.imagemetadata.statistics.model.ImageMetadataStatistics;
import org.api.unsplash.domain.links.model.Links;
import org.api.unsplash.domain.socialdata.model.SocialData;
import org.api.unsplash.domain.sponsor.model.Sponsor;
import org.api.unsplash.domain.sponsorship.model.Sponsorship;
import org.api.unsplash.domain.tag.model.Tag;
import org.api.unsplash.domain.url.model.Urls;
import org.api.unsplash.domain.user.model.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document
public class ImageMetadata {
  @Id private String id;
  private String slug;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private LocalDateTime promotedAt;
  private Integer width;
  private Integer height;
  private String color;
  private String blurHash;
  private String description;
  private String altDescription;
  private Urls urls;
  private Links links;
  private Integer likes;
  private Boolean likedByUser;
  private Sponsorship sponsorship;
  private String tagline;
  private String taglineUrl;
  private Sponsor sponsor;
  private String location;
  private Image profileImage;
  private String instagramUsername;
  private Integer totalCollections;
  private Integer totalLikes;
  private Integer totalPhotos;
  private Boolean acceptedTos;
  private Boolean forHire;
  private SocialData social;
  private ImageMetadataTopicSubmissions topicSubmissions;
  private Boolean premium;
  private Boolean plus;
  private User user;
  private List<Tag> tags;
  private ImageMetadataStatistics statistics;
}
