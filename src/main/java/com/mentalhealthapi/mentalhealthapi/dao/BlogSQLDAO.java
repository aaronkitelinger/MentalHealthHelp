package com.mentalhealthapi.mentalhealthapi.dao;

import com.mentalhealthapi.mentalhealthapi.dao.interfaces.IBlogDatabaseAccess;
import com.mentalhealthapi.mentalhealthapi.dto.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("BlogDAO")
public class BlogSQLDAO implements IBlogDatabaseAccess {


    @Autowired
    BlogRepository blogRepository;

    @Override
    public Blog GetBlog(int id) {
        return blogRepository.findById(id).get();

    }

    @Override
    public Blog Edit(Blog blog) {
        return null;
    }

    @Override
    public Blog save(Blog blog) throws Exception {
        Blog createdBlog = blogRepository.save(blog);
        return createdBlog;

    }

    @Override
    public void delete(int id) throws Exception {
        blogRepository.deleteById(id);

    }

    @Override
    public List<Blog> fetchAll() {
        List<Blog> allBlogs = new ArrayList<>();
        Iterable<Blog> blogs = blogRepository.findAll();
        for (Blog blog : blogs){
            allBlogs.add(blog);
        }
        return allBlogs;

    }
}
