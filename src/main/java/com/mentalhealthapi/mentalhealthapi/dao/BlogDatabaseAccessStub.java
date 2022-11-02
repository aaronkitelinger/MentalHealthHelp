package com.mentalhealthapi.mentalhealthapi.dao;

import com.mentalhealthapi.mentalhealthapi.dto.Blog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlogDatabaseAccessStub implements IBlogDatabaseAccess {

    Map<Integer, Blog> blogs = new HashMap<>();

    @Override
    public Blog save(Blog blog) {
        int blogId = blog.getId();
        blogs.put(blogId, blog);
        return blog;
    }

    @Override
    public void delete(int id) {
        blogs.remove(id);
    }

    @Override
    public List<Blog> fetchAll() {
        Blog testBlog = new Blog();
        testBlog.setId(1);
        testBlog.setTitle("TEST TITLE");
        testBlog.setDisorderName("TEST DISORDER NAME");
        testBlog.setBody("TEST BODY.TEST BODY.TEST BODY.TEST BODY.TEST BODY.TEST BODY.TEST BODY.TEST BODY.TEST BODY.");

        blogs.put(1, testBlog);

        return new ArrayList<>(blogs.values());
    }
}
