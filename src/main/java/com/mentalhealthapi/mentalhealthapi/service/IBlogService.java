package com.mentalhealthapi.mentalhealthapi.service;

import com.mentalhealthapi.mentalhealthapi.dto.Blog;

import java.util.List;

public interface IBlogService {

    /**
     * Fetch all blogs - regardless the user
     * @return a list of blogs
     */
    List<Blog> fetchAll();

    /**
     * Fetch blog using an ID
     * @param id a unique identifier for a blog
     * @return blog or null if none
     */
    Blog fetchById(int id);

    /**
     * Delete a blog given the id
     * @param id
     */
    void deleteById(int id);

    /**
     * Save a blog
     * @param blog1
     * @return
     */
    Blog save(Blog blog1) throws Exception;
}
