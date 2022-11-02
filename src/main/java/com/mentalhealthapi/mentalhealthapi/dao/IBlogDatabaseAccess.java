package com.mentalhealthapi.mentalhealthapi.dao;

import com.mentalhealthapi.mentalhealthapi.dto.Blog;

import java.util.List;
import java.util.Map;

public interface IBlogDatabaseAccess {

    /**
     * Save a blog.
     * @param blog
     * @return
     */
    Blog save(Blog blog);

    /**
     * Delete a blog given an id.
     * @param id
     */
    void delete(int id) throws Exception;

    /**
     * Fetch all blogs.
     * @return
     */
    List<Blog> fetchAll();
}
