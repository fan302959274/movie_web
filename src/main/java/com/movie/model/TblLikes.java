package com.movie.model;

import java.util.Date;

public class TblLikes extends BaseModel {
    private Long id;

    private Date likesTime;

    private String likesUser;

    private String videoId;

    private Date createDate;

    private Date updateDate;

    private String creator;

    private String updator;

    private String isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getLikesTime() {
        return likesTime;
    }

    public void setLikesTime(Date likesTime) {
        this.likesTime = likesTime;
    }

    public String getLikesUser() {
        return likesUser;
    }

    public void setLikesUser(String likesUser) {
        this.likesUser = likesUser;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }
}