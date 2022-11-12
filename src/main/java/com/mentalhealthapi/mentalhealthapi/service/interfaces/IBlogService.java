package com.mentalhealthapi.mentalhealthapi.service.interfaces;

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
     * @param id id of the blog object to delete.
     */
    void deleteById(int id) throws Exception;

    /**
     * Save a blog
     * @param blog object to save.
     * @return the saved object.
     */
    Blog save(Blog blog);
}
