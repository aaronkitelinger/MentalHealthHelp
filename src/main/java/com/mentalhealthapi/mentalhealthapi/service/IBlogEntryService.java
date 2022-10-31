package com.mentalhealthapi.mentalhealthapi.service;

import com.mentalhealthapi.mentalhealthapi.dto.BlogEntry;

import java.util.List;

public interface IBlogEntryService {

    /**
     * Fetch all blog entries - regardless the user
     * @return a list of blog entries
     */
    List<BlogEntry> fetchAll();

    /**
     * Delete a blog entry given the id
     * @param id
     */
    void deleteById(int id);

    /**
     * Save a blog entry
     * @param blogEntry1
     * @return
     */
    BlogEntry save(BlogEntry blogEntry1) throws Exception;
}
