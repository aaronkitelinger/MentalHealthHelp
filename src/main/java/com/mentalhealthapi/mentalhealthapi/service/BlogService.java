package com.mentalhealthapi.mentalhealthapi.service;

import java.util.List;

import com.mentalhealthapi.mentalhealthapi.dao.interfaces.IBlogDatabaseAccess;
import com.mentalhealthapi.mentalhealthapi.dto.Blog;
import com.mentalhealthapi.mentalhealthapi.service.interfaces.IBlogService;

public class BlogService implements IBlogService {

    private IBlogDatabaseAccess blogDAO;

    public BlogService(IBlogDatabaseAccess blogDAO) {
        this.blogDAO = blogDAO;
    }

    @Override
    public Blog GetBlogById(int id) {
        return blogDAO.GetBlog(id);
    }

    @Override
    public Blog Edit(Blog blog) {
        return blogDAO.Edit(blog);
    }



    @Override
    public List<Blog> fetchAll() {
        return blogDAO.fetchAll();
    }

    @Override
    public void deleteById(int id) throws Exception {
        blogDAO.delete(id);
    }

    @Override
    public Blog save(Blog blog) {
        return blogDAO.save(blog);
    }
}
