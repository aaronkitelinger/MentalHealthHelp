package com.mentalhealthapi.mentalhealthapi.dto;

import lombok.Data;

public @Data class Blog {
    private int id;
    private int userId;
    // or private int User; firebase auth?
    private int disorderId;
    private String title;
    private String body;
}
