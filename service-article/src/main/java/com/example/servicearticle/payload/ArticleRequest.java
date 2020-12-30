package com.example.servicearticle.payload;

import javax.validation.constraints.NotBlank;

public class ArticleRequest {

    @NotBlank
    private String contents;

    @NotBlank
    private String userId;

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
