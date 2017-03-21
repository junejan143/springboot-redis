package com.zychen.service;

//import com.zychen.dao.mapper.user.IUserDao;
import java.util.List;

import com.zychen.dao.mapper.article.IArticleDao;
import com.zychen.dao.mapper.user.IUserDao;
import com.zychen.domain.Article;
import com.zychen.domain.PageResult;
import com.zychen.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wb-zyc241205 on 2017/3/14.
 *
 * @author wb-zyc241205
 * @date 2017/03/14
 */
@Service
public class ArticleService {

    @Autowired
    private IArticleDao articleDao;
    @Autowired
    private RedisTemplate<String, Article> redisTemplate;


    public Integer saveArticle(Article article) {
        Integer articleId = articleDao.saveArticle(article);
        redisTemplate.opsForValue().set(article.getArticleContent(),article);
        return articleId;
    }

    public PageResult<Article> listArticle(Integer pageNo, Integer pageSize) {
        PageResult<Article> pageResult = new PageResult<>();
        List<Article> articles = articleDao.listArticle(pageNo, pageSize);
        Integer countArticle = articleDao.countArticle();
        //countArticle/pageNo
        pageResult.setData(articles);
        return pageResult;
    }
}
