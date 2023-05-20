package org.api.unsplash.adapter.in.api.imagemetadata.model.user;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class UserDto {
  @JsonProperty("id")
  private String id;

  @JsonProperty("updated_at")
  private String updatedAt;

  @JsonProperty("username")
  private String username;

  @JsonProperty("name")
  private String name;

  @JsonProperty("first_name")
  private String firstName;

  @JsonProperty("last_name")
  private String lastName;

  @JsonProperty("twitter_username")
  private String twitterUsername;

  @JsonProperty("portfolio_url")
  private String portfolioUrl;

  @JsonProperty("bio")
  private String bio;

  @JsonProperty("location")
  private String location;

  @JsonProperty("link")
  private Links links;

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
  private SocialData social;
}
