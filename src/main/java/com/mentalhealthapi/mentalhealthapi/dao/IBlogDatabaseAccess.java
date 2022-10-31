package com.mentalhealthapi.mentalhealthapi.dao;

import com.mentalhealthapi.mentalhealthapi.dto.BlogEntry;

public interface IBlogDatabaseAccess {

    /**
     * Save a blog entry.
     * @param blogEntry1
     * @return
     */
    BlogEntry save(BlogEntry blogEntry1);
}
