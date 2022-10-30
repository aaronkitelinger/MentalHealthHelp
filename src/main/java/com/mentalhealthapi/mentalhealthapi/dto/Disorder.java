package com.mentalhealthapi.mentalhealthapi.dto;

import lombok.Data;

public @Data class Disorder {
    private int id;
    private String name;
    private String description;
    private int dsm5Page;
    private float populationPercent;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDsm5Page() {
        return dsm5Page;
    }

    public void setDsm5Page(int dsm5Page) {
        this.dsm5Page = dsm5Page;
    }

    public float getPopulationPercent() {
        return populationPercent;
    }

    public void setPopulationPercent(float populationPercent) {
        this.populationPercent = populationPercent;
    }
}