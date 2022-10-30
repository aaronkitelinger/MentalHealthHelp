package com.mentalhealthapi.mentalhealthapi.dto;

import lombok.Data;

public @Data class BlogEntry {
    private int id;
    private String disorderName;
    private String title;
    private String body;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisorderName() {
        return disorderName;
    }

    public void setDisorderName(String disorderName) {
        this.disorderName = disorderName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}