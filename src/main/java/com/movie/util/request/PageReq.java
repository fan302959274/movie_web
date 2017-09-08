package com.movie.util.request;/**
 * Created by sh00859 on 2017/7/20.
 */


import com.movie.util.response.ResponseCode;

import java.util.List;

/**
 * 通用请求类
 *
 * @author
 * @create 2017-07-20 10:57
 **/
public class PageReq<T> {
    private Integer page;
    private Integer pageSize;
    private T param;

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

    public T getParam() {
        return param;
    }

    public void setParam(T param) {
        this.param = param;
    }
}