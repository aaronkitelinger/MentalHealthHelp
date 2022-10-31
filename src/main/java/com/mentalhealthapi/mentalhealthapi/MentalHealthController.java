package com.mentalhealthapi.mentalhealthapi;

import com.mentalhealthapi.mentalhealthapi.service.BlogServiceStub;
import com.mentalhealthapi.mentalhealthapi.service.DisorderServiceStub;
import com.mentalhealthapi.mentalhealthapi.service.IBlogService;
import com.mentalhealthapi.mentalhealthapi.service.IDisorderService;
import com.mentalhealthapi.mentalhealthapi.dto.Blog;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MentalHealthController {

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
        IDisorderService disorderService = new DisorderServiceStub();
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
        IBlogService blogService = new BlogServiceStub();
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
        return blog;
    }

    /**
     * Delete a blog given the id of the blog (and the username)
     * @param id
     * @return
     */
    @DeleteMapping("/blog/{id}/")
    public String deleteBlog(@PathVariable("id") int id) {
        IBlogService blogService = new BlogServiceStub();
        blogService.deleteById(id);
        return "blog";
    }

}
