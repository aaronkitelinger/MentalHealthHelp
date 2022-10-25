package com.mentalhealthapi.mentalhealthapi;

import com.mentalhealthapi.mentalhealthapi.dao.BlogServiceStub;
import com.mentalhealthapi.mentalhealthapi.dao.DisorderServiceStub;
import com.mentalhealthapi.mentalhealthapi.dao.IBlogService;
import com.mentalhealthapi.mentalhealthapi.dao.IDisorderService;
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
    @RequestMapping("/disorders")
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
    @RequestMapping("/blog")
    public String blog(Model model) {
        // TODO: Use real implementation instead of STUB when we have a database
        IBlogService blogService = new BlogServiceStub();
        model.addAttribute("blogs", blogService.fetchAll());
        return "blog";
    }

}
