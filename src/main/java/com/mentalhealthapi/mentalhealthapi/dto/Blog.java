package com.mentalhealthapi.mentalhealthapi.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public @Data
class Blog {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String disorderName;
    private String title;
    private String body;
}
