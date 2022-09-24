package com.mentalhealthapi.mentalhealthapi.dto;

import lombok.Data;

public @Data class Disorder {
    private int id;
    private String name;
    private String description;
    private String dsm5Page;
    private float populationPercent;
}
