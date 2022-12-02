package com.mentalhealthapi.mentalhealthapi.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public @Data
class Disorder {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int disorderId;
    private String name;
    private String description;
}
