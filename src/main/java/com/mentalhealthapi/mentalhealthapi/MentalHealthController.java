package com.mentalhealthapi.mentalhealthapi;

import com.mentalhealthapi.mentalhealthapi.dto.Blog;
import com.mentalhealthapi.mentalhealthapi.dto.Disorder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Here is our end points. The C of MVC
 */
@Controller
public class MentalHealthController {

    /**
     * Root end point (/).
     * @return index page
     */
    @RequestMapping("/")
    public String index() {
        // has to be the same as the template html page inside 'resources' folder
        return "start";
    }

    /**
     * Fetch a list of all disorders.
     * @return disorders page
     */
    @GetMapping("/disorders")
    public ResponseEntity fetchAllDisorders() {
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * Fetch a disorder by name
     * @return specific disorder page
     */
    @GetMapping("/disorders/{name}/")
    public ResponseEntity fetchDisorder(@PathVariable("name") String name) {
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * Fetch a list of all blogs in a specific disorder
     * @return a list of blogs given disorder name
     */
    @GetMapping("/disorders/{name}/blogs/")
    public ResponseEntity fetchBlogs(@PathVariable("name") String name) {
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * Post a blog to a database
     * @return created blog
     */
    @PostMapping(value = "/disorders/{name}/blog", consumes = "application/json", produces = "application/json")
    public Blog createBlog(@PathVariable("name") String name, @RequestBody Blog blog) {
        // we're going to need a user id passed here as well. for now, let's not worry about it

        // for not, just return created blog as a stub
        return blog;
    }

    /**
     * Delete a blog
     * @param name
     * @param blog
     * @return
     */
    @DeleteMapping("/disorders/{name}/blog/{id}/")
    public ResponseEntity deleteBlog(@PathVariable("name") String name, @PathVariable("id") int id) {
        // we're going to need a user id passed here as well. for now, let's not worry about it
        return new ResponseEntity(HttpStatus.OK);
    }
}
