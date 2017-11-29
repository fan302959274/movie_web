package com.movie.util.enums;

/**
 * @author sh00859
 * @description 参数类型
 * @date 2017/7/13
 */
public enum ParamEnum {
    MOVIE_TYPE("001", "视频类型"),
    MOVIE_TAG("002", "视频标签"),
    TOP_PIC("003", "轮转图片");


    private String paramType;
    private String paramDesc;

    ParamEnum(String paramType, String paramDesc) {
        this.paramType = paramType;
        this.paramDesc = paramDesc;
    }

    public String getParamType() {
        return paramType;
    }

    public void setParamType(String paramType) {
        this.paramType = paramType;
    }

    public String getParamDesc() {
        return paramDesc;
    }

    public void setParamDesc(String paramDesc) {
        this.paramDesc = paramDesc;
    }
}

