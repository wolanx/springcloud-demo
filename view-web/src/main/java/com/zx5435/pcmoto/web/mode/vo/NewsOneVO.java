package com.zx5435.pcmoto.web.mode.vo;

public class NewsOneVO {

    private Integer id;
    private String title;
    private String description;
    private String thumb;
    private String source_name;
    private Integer views;
    private String publish_at;
    //
    private String content;

    @Override
    public String toString() {
        return "NewsOneVO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", thumb='" + thumb + '\'' +
                ", source_name='" + source_name + '\'' +
                ", views=" + views +
                ", publish_at='" + publish_at + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public String getPublish_at() {
        return publish_at;
    }

    public void setPublish_at(String publish_at) {
        this.publish_at = publish_at;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getSource_name() {
        return source_name;
    }

    public void setSource_name(String source_name) {
        this.source_name = source_name;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
