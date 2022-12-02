package com.mentalhealthapi.mentalhealthapi.dao.interfaces;

import java.util.List;
import com.mentalhealthapi.mentalhealthapi.dto.Blog;

public interface IBlogDatabaseAccess {


    /**
     * get blog
     * @param id of blog wanted to be retrieved
     * @return blog
     */
    Blog GetBlog(int id);
    /**
     * Edit a blog
     * @param blog
     * @return Edited Blog
     */
    Blog Edit(Blog blog);

    /**
     * Save a blog.
     * @param blog
     * @return the saved blog object.
     */
    Blog save(Blog blog) throws Exception;

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
