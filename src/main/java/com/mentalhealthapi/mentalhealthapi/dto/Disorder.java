package com.mentalhealthapi.mentalhealthapi.dto;

import lombok.Data;

public @Data class Disorder {
    private int id;
    private String name;
    private String description;
    private int dsm5Page;
    private float populationPercent;
}
