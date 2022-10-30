package com.mentalhealthapi.mentalhealthapi.service;

import com.mentalhealthapi.mentalhealthapi.dto.BlogEntry;

import java.util.List;

public interface IBlogService {

    /**
     * Fetch all blogs - regardless the user
     * @return a list of blogs
     */
    List<BlogEntry> fetchAll();

    /**
     * Delete a blog given the id
     * @param id
     */
    void deleteById(int id);

    /**
     * Save a blog
     * @param blogEntry1
     * @return
     */
    BlogEntry save(BlogEntry blogEntry1) throws Exception;
}
