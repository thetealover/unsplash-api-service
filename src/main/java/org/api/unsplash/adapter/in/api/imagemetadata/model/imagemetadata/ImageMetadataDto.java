package org.api.unsplash.adapter.in.api.imagemetadata.model.imagemetadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.api.unsplash.adapter.in.api.imagemetadata.model.imagemetadata.statistics.ImageMetadataStatisticsDto;
import org.api.unsplash.adapter.in.api.imagemetadata.model.link.LinksDto;
import org.api.unsplash.adapter.in.api.imagemetadata.model.socialdata.SocialDataDto;
import org.api.unsplash.adapter.in.api.imagemetadata.model.sponsor.SponsorDto;
import org.api.unsplash.adapter.in.api.imagemetadata.model.sponsorship.SponsorshipDto;
import org.api.unsplash.adapter.in.api.imagemetadata.model.tag.TagDto;
import org.api.unsplash.adapter.in.api.imagemetadata.model.url.UrlsDto;
import org.api.unsplash.adapter.in.api.imagemetadata.model.user.UserDto;
import org.api.unsplash.domain.image.Image;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ImageMetadataDto {
  @JsonProperty("id")
  private String id;

  @JsonProperty("slug")
  private String slug;

  @JsonProperty("created_at")
  private LocalDateTime createdAt;

  @JsonProperty("updated_at")
  private LocalDateTime updatedAt;

  @JsonProperty("promoted_at")
  private LocalDateTime promotedAt;

  @JsonProperty("width")
  private Integer width;

  @JsonProperty("height")
  private Integer height;

  @JsonProperty("color")
  private String color;

  @JsonProperty("blur_hash")
  private String blurHash;

  @JsonProperty("description")
  private String description;

  @JsonProperty("alt_description")
  private String altDescription;

  @JsonProperty("urls")
  private UrlsDto urls;

  @JsonProperty("links")
  private LinksDto links;

  @JsonProperty("likes")
  private Integer likes;

  @JsonProperty("liked_by_user")
  private Boolean likedByUser;

  @JsonProperty("sponsorship")
  private SponsorshipDto sponsorship;

  @JsonProperty("tagline")
  private String tagline;

  @JsonProperty("tagline_url")
  private String taglineUrl;

  @JsonProperty("sponsor")
  private SponsorDto sponsor;

  @JsonProperty("location")
  private String location;

  @JsonProperty("profile_image")
  private Image profileImage;

  @JsonProperty("instagram_username")
  private String instagramUsername;

  @JsonProperty("total_collections")
  private Integer totalCollections;

  @JsonProperty("total_likes")
  private Integer totalLikes;

  @JsonProperty("total_photos")
  private Integer totalPhotos;

  @JsonProperty("accepted_tos")
  private Boolean acceptedTos;

  @JsonProperty("for_hire")
  private Boolean forHire;

  @JsonProperty("social")
  private SocialDataDto social;

  @JsonProperty("topic_submissions")
  private ImagesMetadataTopicSubmissionsDto topicSubmissions;

  @JsonProperty("premium")
  private Boolean premium;

  @JsonProperty("plus")
  private Boolean plus;

  @JsonProperty("user")
  private UserDto user;

  @JsonProperty("tags")
  private List<TagDto> tags;

  @JsonProperty("statistics")
  private ImageMetadataStatisticsDto statistics;
}
