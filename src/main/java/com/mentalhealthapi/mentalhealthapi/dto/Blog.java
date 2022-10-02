package com.mentalhealthapi.mentalhealthapi.dto;

import lombok.Data;

public @Data class Blog {
    private int id;
    // or private int User; firebase auth?
    private int userId;
    private int disorderId;
    private String title;
    private String body;
}
