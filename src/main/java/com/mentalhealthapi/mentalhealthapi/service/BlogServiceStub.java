package com.mentalhealthapi.mentalhealthapi.service;

import com.mentalhealthapi.mentalhealthapi.dao.IBlogDatabaseAccess;
import com.mentalhealthapi.mentalhealthapi.dto.BlogEntry;

import java.util.ArrayList;
import java.util.List;

public class BlogServiceStub {

    private IBlogDatabaseAccess blogDAO;

    public BlogServiceStub() {}
    public BlogServiceStub(IBlogDatabaseAccess blogDAO) {
        this.blogDAO = blogDAO;
    }

    public List<BlogEntry> fetchAll() {
        //creates a new Blog entry named blog1
        //sets name title and body for blog1
        BlogEntry blogEntry1 = new BlogEntry();
        blogEntry1.setDisorderName("Depression");
        blogEntry1.setTitle("Day 1");
        blogEntry1.setBody("This is the body text of this blog. Example Text: A group of conditions associated with the elevation or lowering of a person's mood, such as depression or bipolar disorder.");

        //creates a new Blog entry named blog2
        //sets name title and body for blog2
        BlogEntry blogEntry2 = new BlogEntry();
        blogEntry2.setDisorderName("Bipolar Disorder");
        blogEntry2.setTitle("Day 1");
        blogEntry2.setBody("This is the body text of this blog. Example Text: A group of conditions associated with the elevation or lowering of a person's mood, such as depression or bipolar disorder.");

        //creates a new Blog entry named blog3
        //sets name title and body for blog3
        BlogEntry blogEntry3 = new BlogEntry();
        blogEntry3.setDisorderName("RAD");
        blogEntry3.setTitle("Day 1");
        blogEntry3.setBody("This is the body text of this blog. Example Text: A group of conditions associated with the elevation or lowering of a person's mood, such as depression or bipolar disorder.");

        //creates a list with the populated blog entries
        List<BlogEntry> blogEntries = new ArrayList<>();
        blogEntries.add(blogEntry1);
        blogEntries.add(blogEntry2);
        blogEntries.add(blogEntry3);

        //returns lost of blog entries to be displayed on the blog page
        return blogEntries;
    }

    /**
     * Delete a blog given the id
     *
     * @param id
     */

    public void deleteById(int id) {
        System.out.println("Blog deleted. Blog Id: " + id);
    }

    /**
     * Save a blog
     *
     * @param blogEntry1
     * @return
     */

    public BlogEntry save(BlogEntry blogEntry1) throws Exception {
        return blogDAO.save(blogEntry1);
    }

}
