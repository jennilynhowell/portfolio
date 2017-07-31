package com.jennilyn.models;

public class Project {
    private long id;
    private String title;
    private String subheader;
    private String description;
    private String gitUrl;
    private String liveUrl;
    private String monthCreated;
    private String category;
    private String thumbnailUrl;
    private String largeUrl;

    public Project(long id, String title, String subheader, String description, String gitUrl, String liveUrl, String monthCreated, String category, String thumbnailUrl, String largeUrl) {
        this.id = id;
        this.title = title;
        this.subheader = subheader;
        this.description = description;
        this.gitUrl = gitUrl;
        this.liveUrl = liveUrl;
        this.monthCreated = monthCreated;
        this.category = category;
        this.thumbnailUrl = thumbnailUrl;
        this.largeUrl = largeUrl;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubheader() {
        return subheader;
    }

    public void setSubheader(String subheader) {
        this.subheader = subheader;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public String getLiveUrl() {
        return liveUrl;
    }

    public void setLiveUrl(String liveUrl) {
        this.liveUrl = liveUrl;
    }

    public String getMonthCreated() {
        return monthCreated;
    }

    public void setMonthCreated(String monthCreated) {
        this.monthCreated = monthCreated;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getLargeUrl() {
        return largeUrl;
    }

    public void setLargeUrl(String largeUrl) {
        this.largeUrl = largeUrl;
    }
}
