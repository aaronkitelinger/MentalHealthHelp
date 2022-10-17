package com.mentalhealthapi.mentalhealthapi.service;

import com.mentalhealthapi.mentalhealthapi.dto.Blog;

import java.util.ArrayList;
import java.util.List;

public class BlogServiceStub implements IBlogService{

    /**
     * Fetch all blogs - regardless the user
     *
     * @return a list of blogs
     */
    @Override
    public List<Blog> fetchAll() {
        Blog blog1 = new Blog();
        blog1.setUsername("username1");
        blog1.setDisorderName("Depression");
        blog1.setTitle("Day 1");
        blog1.setBody("This is the body text of this blog. Example Text: A group of conditions associated with the elevation or lowering of a person's mood, such as depression or bipolar disorder.");

        Blog blog2 = new Blog();
        blog2.setUsername("username234243");
        blog2.setDisorderName("Bipolar Disorder");
        blog2.setTitle("Day 1");
        blog2.setBody("This is the body text of this blog. Example Text: A group of conditions associated with the elevation or lowering of a person's mood, such as depression or bipolar disorder.");

        Blog blog3 = new Blog();
        blog3.setUsername("username1");
        blog3.setDisorderName("RAD");
        blog3.setTitle("Day 1");
        blog3.setBody("This is the body text of this blog. Example Text: A group of conditions associated with the elevation or lowering of a person's mood, such as depression or bipolar disorder.");

        List<Blog> blogs = new ArrayList<>();
        blogs.add(blog1);
        blogs.add(blog2);
        blogs.add(blog3);

        return blogs;
    }

}
