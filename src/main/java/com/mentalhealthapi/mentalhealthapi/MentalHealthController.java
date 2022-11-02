package com.mentalhealthapi.mentalhealthapi;

import com.mentalhealthapi.mentalhealthapi.dao.BlogDatabaseAccessStub;
import com.mentalhealthapi.mentalhealthapi.dao.DisorderDatabaseAccessStub;
import com.mentalhealthapi.mentalhealthapi.service.BlogServiceStub;
import com.mentalhealthapi.mentalhealthapi.service.DisorderServiceStub;
import com.mentalhealthapi.mentalhealthapi.service.IBlogService;
import com.mentalhealthapi.mentalhealthapi.service.IDisorderService;
import com.mentalhealthapi.mentalhealthapi.dto.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MentalHealthController {

    IDisorderService disorderService = new DisorderServiceStub(new DisorderDatabaseAccessStub());
    IBlogService blogService = new BlogServiceStub(new BlogDatabaseAccessStub());

    /**
     * Root end point (/).
     * @return index page
     */
    @RequestMapping("/")
    public String index() {
        return "start";
    }

    /**
     * Go to Disorders page on /disorders
     * @return
     */
    @GetMapping("/disorders")
    public String disorders(Model model) {
        // TODO: Use real implementation instead of STUB when we have a database
        model.addAttribute("disorders", disorderService.fetchAllDisorders());
        return "disorders";
    }

    /**
     * Go to Your Stories page on /blog
     * @return
     */
    @GetMapping("/blog")
    public String blog(Model model) {
        // TODO: Use real implementation instead of STUB when we have a database
        model.addAttribute("blogs", blogService.fetchAll());
        return "blog";
    }

    /**
     * Create a new blog.
     * @param blog
     * @return the new blog that was created (for now)
     */
    @PostMapping(value = "/blog", consumes = "application/json", produces = "application/json")
    public Blog createBlog(@RequestBody Blog blog) {
        return blogService.save(blog);
    }

    /**
     * Delete a blog given the id of the blog (and the username)
     * @param id
     * @return
     */
    @DeleteMapping("/blog/{id}/")
    public ResponseEntity<HttpStatus> deleteBlog(@PathVariable("id") int id) {
        try {
            blogService.deleteById(id);
            return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
