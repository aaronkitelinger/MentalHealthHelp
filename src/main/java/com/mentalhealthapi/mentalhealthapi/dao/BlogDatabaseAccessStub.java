package com.mentalhealthapi.mentalhealthapi.dao;

import com.mentalhealthapi.mentalhealthapi.dao.interfaces.IBlogDatabaseAccess;
import com.mentalhealthapi.mentalhealthapi.dto.Blog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlogDatabaseAccessStub implements IBlogDatabaseAccess {

    Logger logger = LoggerFactory.getLogger(BlogDatabaseAccessStub.class);

    Map<Integer, Blog> blogs = new HashMap<>();

    public BlogDatabaseAccessStub() {
        Blog testBlog = new Blog();
        testBlog.setBlogId(1);
        testBlog.setTitle("TEST TITLE");
        testBlog.setDisorderName("TEST DISORDER NAME");
        testBlog.setBody("TEST BODY.TEST BODY.TEST BODY.TEST BODY.TEST BODY.TEST BODY.TEST BODY.TEST BODY.TEST BODY.");

        Blog testBlog2 = new Blog();
        testBlog2.setBlogId(2);
        testBlog2.setTitle("TEST TITLE 2");
        testBlog2.setDisorderName("TEST DISORDER NAME 2");
        testBlog2.setBody("TEST BODY.TEST BODY.TEST BODY.TEST BODY.TEST BODY.TEST BODY.TEST BODY.TEST BODY.TEST BODY.");

        Blog testBlog3 = new Blog();
        testBlog3.setBlogId(3);
        testBlog3.setTitle("TEST TITLE 3");
        testBlog3.setDisorderName("TEST DISORDER NAME 3");
        testBlog3.setBody("TEST BODY.TEST BODY.TEST BODY.TEST BODY.TEST BODY.TEST BODY.TEST BODY.TEST BODY.TEST BODY.");

        blogs.put(testBlog.getBlogId(), testBlog);
        blogs.put(testBlog2.getBlogId(), testBlog2);
        blogs.put(testBlog3.getBlogId(), testBlog3);
    }

    @Override
    public Blog save(Blog blog) {
        int blogId = (int)(Math.random() * 100) * (int)(Math.random() * 100);
        blog.setBlogId(blogId);
        logger.info("new blog id: " + blogId);
        blogs.put(blogId, blog);
        return blog;
    }

    @Override
    public void delete(int id) { 
        blogs.remove(id);
    }

    @Override
    public List<Blog> fetchAll() {
        return new ArrayList<>(blogs.values());
    }

    @Override
    public Blog Edit(Blog blog){
        Blog editedBlog = new Blog();

        editedBlog.setBlogId(blog.getBlogId());
        editedBlog.setBody(blog.getBody());
        editedBlog.setDisorderName(blog.getDisorderName());
        editedBlog.setTitle(blog.getTitle());
        return editedBlog;

    }
    @Override
    public Blog GetBlog(int id){
        Blog blog = blogs.get(id);
        return blog;
    }
}
