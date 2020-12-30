package com.example.servicearticle.services;

import com.example.servicearticle.dao.ArticleRepository;
import com.example.servicearticle.domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService{

    @Autowired
    ArticleRepository repository;

    @Override
    public void addNewArticle(Article article) {
        repository.insert(article);
    }

    @Override
    public List<Article> getAllArticle() {
        return repository.findAll();
    }
}
