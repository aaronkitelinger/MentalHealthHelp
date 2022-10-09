package com.mentalhealthapi.mentalhealthapi.dto;

import lombok.Data;

public @Data class Blog {
    private int id;
    private int userId;
    private int disorderId;
    private String title;
    private String body;
}
