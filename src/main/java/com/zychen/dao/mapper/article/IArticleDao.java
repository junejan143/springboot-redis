package com.zychen.dao.mapper.article;


import java.util.List;

import com.zychen.domain.Article;

public interface IArticleDao {

    Integer saveArticle(Article article);

    List<Article> listArticle(Integer pageNo, Integer pageSize);

    Integer countArticle();
}
