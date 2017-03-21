package com.zychen.domain;

import java.util.List;

/**
 * Created by wb-zyc241205 on 2017/3/21.
 *
 * @author wb-zyc241205
 * @date 2017/03/21
 */
public class PageResult<T> {

    /** 当前页 **/
    private Integer pageNo;
    /** 每页条数 **/
    private Integer pageSize;
    /** 总页数 **/
    private Integer pageCount;
    /** 分页数据 **/
    private List<T> data;

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
