package com.example.mentalhealthhelp.mentalhealthhelp.dto;

import lombok.Data;

public @Data class DisorderInfoDTO {
    private int disorderId;
    private String disorderName;
    private String disorderDescription;
    private int DSM5Page;
    private float percentOfPeople;
}
