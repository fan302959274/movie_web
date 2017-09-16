package com.movie.model.extend;

import com.movie.model.TblVideo;

public class TblVideoExtend extends TblVideo {
    private String videoTypeName;
    private String videoTagName;

    public String getVideoTypeName() {
        return videoTypeName;
    }

    public void setVideoTypeName(String videoTypeName) {
        this.videoTypeName = videoTypeName;
    }

    public String getVideoTagName() {
        return videoTagName;
    }

    public void setVideoTagName(String videoTagName) {
        this.videoTagName = videoTagName;
    }
}