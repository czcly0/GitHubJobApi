package com.laioffer.Job.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true) // indicates that other fields in the response can be safely ignored. Without this, you'll get an exception at runtime
@JsonInclude(JsonInclude.Include.NON_NULL) // indicates that null fields can be skipped and not included
public class Item {
    private String id;
    private String title;
    private String location;
    private String companyLogo;
    private String url;
    private String description;
    private Set<String> keywords;
    private boolean favorite;

    // @JsonProperty("") indicates the mapping. This field is optional if the property name is the same as the JSON key,
    // but it's required for multi-word snake case and camel case conversions, like company_log to companyLogo
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("company_logo")
    public String getCompanyLogo() {
        return companyLogo;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public Set<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(Set<String> keywords) {
        this.keywords = keywords;
    }
    public boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
