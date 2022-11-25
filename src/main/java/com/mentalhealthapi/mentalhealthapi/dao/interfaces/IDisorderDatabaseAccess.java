package com.mentalhealthapi.mentalhealthapi.dao.interfaces;

import com.mentalhealthapi.mentalhealthapi.dto.Blog;
import com.mentalhealthapi.mentalhealthapi.dto.Disorder;

import java.util.List;

public interface IDisorderDatabaseAccess {

    /**
    *Delete Disorder
     * @delete disorder based on id
     */
    void delete(int id) throws Exception;
    /**
     * Fetch all disorders.
     * @return a list of disorders.
     */
    List<Disorder> fetchAll();

    Disorder GetDisorder(int id);
    /**
     * Edit a disorder
     * @param disorder
     * @return Edited Disorder
     */
    Disorder Edit(Disorder disorder);

    /**
     * Save a disorder.
     * @param disorder
     * @return the saved disorder object.
     */
    Disorder save(Disorder disorder);

    /**
     * Delete a disorder given an id.
     * @param id id of the disorder object to delete.
     */




}
