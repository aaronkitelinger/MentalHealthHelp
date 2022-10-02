package com.mentalhealthapi.mentalhealthapi.dto;

import lombok.Data;

public @Data class Blog {
    private int id;
    private int userId;
    // TODO(Spurlock): Implement Firebase Authentication with Private int user.
    private int disorderId;
    private String title;
    private String body;
}
