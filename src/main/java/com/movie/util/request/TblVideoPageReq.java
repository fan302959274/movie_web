package com.movie.util.request;/**
 * Created by sh00859 on 2017/7/20.
 */


import com.movie.model.TblVideo;

/**
 * 通用请求类
 *
 * @author
 * @create 2017-07-20 10:57
 **/
public class TblVideoPageReq extends TblVideo {

    private Integer page;
    private Integer pageSize;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

}