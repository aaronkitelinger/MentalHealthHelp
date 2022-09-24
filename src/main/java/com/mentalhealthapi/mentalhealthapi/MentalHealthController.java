package com.mentalhealthapi.mentalhealthapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Here is our end points.
 */
@Controller
public class MentalHealthController {

    /**
     * Root end point (/)
     * @return index page
     */
    @RequestMapping("/")
    public String index() {
        // has to be the same as the template html page inside 'resources' folder
        return "start";
    }
}
