package utils;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetValuesRequestPOJO {

    @JsonProperty
    private Integer id;
    @JsonProperty
    private Boolean site_admin;
    @JsonProperty
    private String email;
    @JsonProperty
    private String created_at;

    public GetValuesRequestPOJO(Integer id, Boolean site_admin, String email, String created_at){
        this.id = id;
        this.site_admin = false;
        this.email = email;
        this.created_at = created_at;
    }
}