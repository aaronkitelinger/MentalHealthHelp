package com.mentalhealthapi.mentalhealthapi.service;

import com.mentalhealthapi.mentalhealthapi.dto.Blog;

import java.util.List;

public interface IBlogService {

    /**
     * Fetch all blogs - regardless the user
     * @return a list of blogs
     */
    List<Blog> fetchAll();
}
