package com.example.servicearticle.services;

import com.example.servicearticle.domain.Article;

import java.util.List;

public interface ArticleService {
    void addNewArticle(Article article);
    List<Article> getAllArticle();
}
