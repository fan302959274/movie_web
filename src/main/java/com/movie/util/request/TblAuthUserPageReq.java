package com.movie.util.request;/**
 * Created by sh00859 on 2017/7/20.
 */


import com.movie.model.TblAuthUser;
import com.movie.model.TblParam;

/**
 * 通用请求类
 *
 * @author
 * @create 2017-07-20 10:57
 **/
public class TblAuthUserPageReq extends TblAuthUser {

    private Integer page;
    private Integer pageSize;
    private Integer offset;
    private Integer limit;

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

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}