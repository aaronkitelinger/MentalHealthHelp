package com.mentalhealthapi.mentalhealthapi.service;

import com.mentalhealthapi.mentalhealthapi.dao.BlogDatabaseAccessStub;
import com.mentalhealthapi.mentalhealthapi.dao.IBlogDatabaseAccess;
import com.mentalhealthapi.mentalhealthapi.dto.Blog;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BlogServiceStub implements IBlogService {

    private IBlogDatabaseAccess blogDAO;

    public BlogServiceStub() {}
    public BlogServiceStub(IBlogDatabaseAccess blogDAO) {
        this.blogDAO = blogDAO;
    }

    /**
     * Fetch all blogs - regardless the user
     *
     * @return a list of blogs
     */
    @Override
    public List<Blog> fetchAll() {
        return blogDAO.fetchAll();
    }

    /**
     * Delete a blog given the id
     *
     * @param id
     */
    @Override
    public void deleteById(int id) throws Exception {
        blogDAO.delete(id);
    }

    /**
     * Save a blog
     *
     * @param blog
     * @return
     */
    @Override
    public Blog save(Blog blog) {
        blogDAO.save(blog);
        return blog;
    }
}
