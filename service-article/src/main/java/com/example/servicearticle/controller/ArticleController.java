package com.example.servicearticle.controller;

import com.example.servicearticle.domain.Article;
import com.example.servicearticle.payload.ArticleRequest;
import com.example.servicearticle.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
//import com.service.authen

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/user")
public class ArticleController {

    @Autowired
    ArticleService service;

    @Autowired
    RestTemplate restTemplate;

    @PostMapping(value = "/article")
    public ResponseEntity<?> saveArticle(@RequestBody ArticleRequest articleRequest) {

//        System.out.println("Start clone user" + articleRequest.getUserId());
//
//        final String uri = "http://localhost:8100/api/user";
//        Map<String, String> params = new HashMap<String, String>();
//        params.put("userId", articleRequest.getUserId());
//        User user = restTemplate.getForObject(uri, User.class, params);
//
//        System.out.println(user);

        Article article = new Article();
        article.setContents(articleRequest.getContents());
        article.setCreatorId(articleRequest.getUserId());
        article.setCreatorName("tinhvv");

        service.addNewArticle(article);

        return ResponseEntity.ok("Success");
    }

    @GetMapping(value = "/article")
    public List<Article> getAllArticle() {
        return service.getAllArticle();
    }
}
