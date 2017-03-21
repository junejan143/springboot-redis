package com.zychen.controller;

import com.zychen.domain.Article;
import com.zychen.domain.PageResult;
import com.zychen.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/article" , method = RequestMethod.POST)
    public Integer saveArticle(@RequestBody Article article){
        return articleService.saveArticle(article);
    }

    @RequestMapping(value = "/article/all" , method = RequestMethod.GET)
    public PageResult<Article> listArticle(@RequestParam Integer pageNo, @RequestParam Integer pageSize){
        return articleService.listArticle(pageNo, pageSize);
    }

}
