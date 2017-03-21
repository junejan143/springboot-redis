package com.zychen.domain;

import java.io.Serializable;

/**
 * Created by wb-zyc241205 on 2017/3/14.
 *
 * @author wb-zyc241205
 * @date 2017/03/14
 */
public class Article implements Serializable {

    private static final long serialVersionUID = -1L;

    /** 主键id **/
    private Integer articleId;
    /** 文章标题 **/
    private String articleName;
    /** 文章内容 **/
    private String articleContent;
    /** 创建时间 **/
    private Long createTime;
    /** 修改时间 **/
    private Long modifyTime;
    /** 用户 **/
    private Integer userId;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }
}