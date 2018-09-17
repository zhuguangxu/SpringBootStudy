package com.example.quickstart.entity;

import lombok.Data;

@Data
public class Card {
    private String avapic;
    private String releasetime;
    private String title;
    private String content;
    private String imgLink;

    public Card(){

    }
    public Card(String avapic, String releasetime, String title, String content, String imgLink) {
        this.avapic = avapic;
        this.releasetime = releasetime;
        this.title = title;
        this.content = content;
        this.imgLink = imgLink;
    }
}
