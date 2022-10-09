package com.mentalhealthapi.mentalhealthapi.service;

import com.mentalhealthapi.mentalhealthapi.dto.Disorder;
import org.springframework.stereotype.Component;

@Component
public class DisorderServiceStub implements IDisorderService {

    /**
     * Fetch a disorder by name.
     *
     * @param name Literal disorder name.
     * @return A disorder object.
     */
    @Override
    public Disorder fetchByName(String name) {
        return null;
    }

    /**
     * Fetch a disorder by id.
     *
     * @param id number that corresponds to the disorder in the database.
     * @return A disorder object.
     */
    @Override
    public Disorder fetchById(int id) {
        return null;
    }
}
