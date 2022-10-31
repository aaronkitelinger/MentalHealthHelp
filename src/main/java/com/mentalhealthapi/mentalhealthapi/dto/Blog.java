package com.mentalhealthapi.mentalhealthapi.dto;

import lombok.Data;

public @Data
class Blog {
    private int id;
    private String disorderName;
    private String title;
    private String body;
}
