package com.movie.model;

import java.math.BigDecimal;
import java.util.Date;

public class TblVideo extends BaseModel {
    private Long id;

    private String videoName;

    private String videoIntroduction;

    private String videoPoster;

    private String videoType;

    private String videoTag;

    private String videoViewPath;

    private String videoDownPath;

    private BigDecimal videoDuration;

    private BigDecimal videoSize;

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

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getVideoIntroduction() {
        return videoIntroduction;
    }

    public void setVideoIntroduction(String videoIntroduction) {
        this.videoIntroduction = videoIntroduction;
    }

    public String getVideoPoster() {
        return videoPoster;
    }

    public void setVideoPoster(String videoPoster) {
        this.videoPoster = videoPoster;
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    public String getVideoTag() {
        return videoTag;
    }

    public void setVideoTag(String videoTag) {
        this.videoTag = videoTag;
    }

    public String getVideoViewPath() {
        return videoViewPath;
    }

    public void setVideoViewPath(String videoViewPath) {
        this.videoViewPath = videoViewPath;
    }

    public String getVideoDownPath() {
        return videoDownPath;
    }

    public void setVideoDownPath(String videoDownPath) {
        this.videoDownPath = videoDownPath;
    }

    public BigDecimal getVideoDuration() {
        return videoDuration;
    }

    public void setVideoDuration(BigDecimal videoDuration) {
        this.videoDuration = videoDuration;
    }

    public BigDecimal getVideoSize() {
        return videoSize;
    }

    public void setVideoSize(BigDecimal videoSize) {
        this.videoSize = videoSize;
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