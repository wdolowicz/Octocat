package utils;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetResponse {

    @JsonProperty
    private String login;
    @JsonProperty
    private Integer id;
    @JsonProperty
    private String node_id;
    @JsonProperty
    private String avatar_url;
    @JsonProperty
    private String gravatar_id;
    @JsonProperty
    private String url;
    @JsonProperty
    private String html_url;
    @JsonProperty
    private String followers_url;
    @JsonProperty
    private String following_url;
    @JsonProperty
    private String gists_url;
    @JsonProperty
    private String starred_url;
    @JsonProperty
    private String subscriptions_url;
    @JsonProperty
    private String organizations_url;
    @JsonProperty
    private String repos_url;
    @JsonProperty
    private String events_url;
    @JsonProperty
    private String received_events_url;
    @JsonProperty
    private String type;
    @JsonProperty
    private Boolean site_admin;
    @JsonProperty
    private String name;
    @JsonProperty
    private String company;
    @JsonProperty
    private String blog;
    @JsonProperty
    private String location;
    @JsonProperty
    private String email;
    @JsonProperty
    private String hireable;
    @JsonProperty
    private String bio;
    @JsonProperty
    private String twitter_username;
    @JsonProperty
    private Integer public_repos;
    @JsonProperty
    private Integer public_gists;
    @JsonProperty
    private Integer followers;
    @JsonProperty
    private Integer following;
    @JsonProperty
    private String created_at;
    @JsonProperty
    private String updated_at;

    public String getLogin() { return login; }
    public Integer getId() { return id; }
    public String getNodeId() { return node_id; }
    public String getAvatar_url() { return avatar_url; }
    public String getGravatar_id() { return gravatar_id; }
    public String getUrl() { return url; }
    public String getHtmlUrl() { return html_url; }
    public String getFollowersUrl() { return followers_url; }
    public String getFollowingUrl() { return following_url; }
    public String getGistsUrl() { return gists_url; }
    public String getStarredUrl() { return starred_url; }
    public String getSubscriptionsUrl() { return subscriptions_url; }
    public String getOrganizationsUrl() { return organizations_url; }
    public String getReposUrl() { return repos_url; }
    public String getEventsUrl() { return events_url; }
    public String getReceivedEventsUrl() { return received_events_url; }
    public String getType() { return type; }
    public Boolean getSiteAdmin() { return site_admin; }
    public String getName() { return name; }
    public String getCompany() { return company; }
    public String getBlog() { return blog; }
    public String getLocation() { return location; }
    public String getEmail() { return email; }
    public String getHireable() { return hireable; }
    public String getBio() { return bio; }
    public String getTwitterUsername() { return twitter_username; }
    public Integer getPublicRepos() { return public_repos; }
    public Integer getPublicGists() { return public_gists; }
    public Integer getFollowers() { return followers; }
    public Integer getFollowing() { return following; }
    public String getCreatedAt() { return created_at; }
    public String getUpdatedAt() { return updated_at; }
}
