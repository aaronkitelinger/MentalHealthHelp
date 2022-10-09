package com.mentalhealthapi.mentalhealthapi.service;

import com.mentalhealthapi.mentalhealthapi.dto.Disorder;

public interface IDisorderService {

    /**
     * Fetch a disorder by name.
     * @param name Literal disorder name.
     * @return A disorder object.
     */
    Disorder fetchByName(String name);

    /**
     * Fetch a disorder by id.
     * @param id number that corresponds to the disorder in the database.
     * @return A disorder object.
     */
    Disorder fetchById(int id);
}
