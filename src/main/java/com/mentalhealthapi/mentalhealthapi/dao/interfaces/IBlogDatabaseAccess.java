package com.mentalhealthapi.mentalhealthapi.dao.interfaces;

import java.util.List;
import com.mentalhealthapi.mentalhealthapi.dto.Blog;

public interface IBlogDatabaseAccess {

    /**
     * Save a blog.
     * @param blog
     * @return the saved blog object.
     */
    Blog save(Blog blog);

    /**
     * Delete a blog given an id.
     * @param id id of the blog object to delete.
     */
    void delete(int id) throws Exception;

    /**
     * Fetch all blogs.
     * @return a list of blogs.
     */
    List<Blog> fetchAll();
}
