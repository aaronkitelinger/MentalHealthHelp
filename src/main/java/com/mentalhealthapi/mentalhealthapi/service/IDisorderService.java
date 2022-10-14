package com.mentalhealthapi.mentalhealthapi.service;

import com.mentalhealthapi.mentalhealthapi.dto.Disorder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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

    /**
     * Fetch all disorders
     * @return
     */
    List<Disorder> fetchAllDisorders();
}
