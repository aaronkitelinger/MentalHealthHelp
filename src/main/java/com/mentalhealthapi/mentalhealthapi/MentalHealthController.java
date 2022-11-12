package com.mentalhealthapi.mentalhealthapi;

import com.mentalhealthapi.mentalhealthapi.dao.BlogDatabaseAccessStub;
import com.mentalhealthapi.mentalhealthapi.dao.DisorderDatabaseAccessStub;
import com.mentalhealthapi.mentalhealthapi.service.BlogService;
import com.mentalhealthapi.mentalhealthapi.service.DisorderService;
import com.mentalhealthapi.mentalhealthapi.service.interfaces.IBlogService;
import com.mentalhealthapi.mentalhealthapi.service.interfaces.IDisorderService;
import com.mentalhealthapi.mentalhealthapi.dto.Blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class MentalHealthController {

    Logger logger = LoggerFactory.getLogger(MentalHealthController.class);

    IDisorderService disorderService = new DisorderService(new DisorderDatabaseAccessStub());
    IBlogService blogService = new BlogService(new BlogDatabaseAccessStub());

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
     * @return template name to direct user to.
     */
    @GetMapping("/disorders")
    public String disorders(Model model) {
        model.addAttribute("disorders", disorderService.fetchAll());
        return "disorders";
    }

    /**
     * Go to Your Stories page on /blog
     * @return template name to direct user to.
     */
    @GetMapping("/blog")
    public String blog(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("disorders", disorderService.fetchAll());
        model.addAttribute("blogs", blogService.fetchAll());
        return "blog";
    }

    /**
     * Create a new blog.
     * @param blog blog object to create.
     * @return template to redirect the user to. On success: /blog, On error: /error.
     */
    @PostMapping(value = "/blog", consumes = "application/x-www-form-urlencoded")
    public String createBlog(Blog blog) {
        try {
            Blog newBlog = blogService.save(blog);
            return "redirect:/blog";
        } catch (Exception e) {
            return "redirect:/error";
        }
    }

    /**
     * Delete a blog given the id of the blog
     * @param id Id of the blog to delete.
     * @return template to redirect the user to. On success: /blog, On error: /error.
     */
    @DeleteMapping("/blog/{id}/")
    public String deleteBlog(@PathVariable("id") int id) {
        try {
            blogService.deleteById(id);
            return "redirect:/blog";
        } catch (Exception e) {
            logger.error("Delete error" + e);
            return "redirect:/error";
        }
    }
}
