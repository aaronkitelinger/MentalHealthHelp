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
     * Delete a blog given the id
     * @param id
     */
    void deleteById(int id) throws Exception;

    /**
     * Save a blog
     * @param blog
     * @return
     */
    Blog save(Blog blog);
}
