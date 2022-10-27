package com.mentalhealthapi.mentalhealthapi.dao;

import com.mentalhealthapi.mentalhealthapi.dto.Blog;

public interface IBlogDatabaseAccess {

    /**
     * Save a blog.
     * @param blog1
     * @return
     */
    Blog save(Blog blog1);
}
