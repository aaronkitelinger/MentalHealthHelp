package com.mentalhealthapi.mentalhealthapi;

import com.mentalhealthapi.mentalhealthapi.dto.BlogEntry;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

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

        // TODO: Use real implementation instead of STUB when we have a database


    /**
     * Go to Your Stories page on /blog
     * @return
     */

        // TODO: Use real implementation instead of STUB when we have a database


    /**
     * Create a new blog entry.
     * @param blogEntry
     * @return the new blog entry that was created (for now)
     */
    @PostMapping(value = "/blog", consumes = "application/json", produces = "application/json")
    public BlogEntry createBlog(@RequestBody BlogEntry blogEntry) {
        return blogEntry;
    }

    /**
     * Delete a blog entry given the id of the blog entry(and the username)
     * @param id
     * @return
     */


}
