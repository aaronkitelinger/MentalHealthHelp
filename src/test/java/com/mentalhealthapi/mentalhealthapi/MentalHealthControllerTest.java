package com.mentalhealthapi.mentalhealthapi;

import com.mentalhealthapi.mentalhealthapi.dto.Blog;
import com.mentalhealthapi.mentalhealthapi.dto.Disorder;
import com.mentalhealthapi.mentalhealthapi.dao.IBlogService;
import com.mentalhealthapi.mentalhealthapi.dao.IDisorderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(MentalHealthController.class)
public class MentalHealthControllerTest {

    @Autowired
    MockMvc mockMvc;
    @MockBean
    IDisorderService disorderService;

    @MockBean
    IBlogService blogService;

    @Test
    void shouldReturnBlogViewWirthPrefilledData() throws Exception {

        Blog blog1 = new Blog();
        blog1.setDisorderName("Depression");
        blog1.setTitle("Day 1");
        blog1.setBody("This is the body text of this blog. Example Text: A group of conditions associated with the elevation or lowering of a person's mood, such as depression or bipolar disorder.");

        Blog blog2 = new Blog();
        blog2.setDisorderName("Bipolar Disorder");
        blog2.setTitle("Day 1");
        blog2.setBody("This is the body text of this blog. Example Text: A group of conditions associated with the elevation or lowering of a person's mood, such as depression or bipolar disorder.");

        Blog blog3 = new Blog();
        blog3.setDisorderName("RAD");
        blog3.setTitle("Day 1");
        blog3.setBody("This is the body text of this blog. Example Text: A group of conditions associated with the elevation or lowering of a person's mood, such as depression or bipolar disorder.");

        List<Blog> blogs = new ArrayList<>();
        blogs.add(blog1);
        blogs.add(blog2);
        blogs.add(blog3);

        when(blogService.fetchAll()).thenReturn(blogs);

        mockMvc
                .perform(MockMvcRequestBuilders.get("/blog"))
                .andExpect(status().isOk())
                .andExpect(view().name("blog"))
                .andExpect(model().attributeExists("blogs"));

    }

    @Test
    void shouldReturnBlogView() throws Exception {
        mockMvc
                .perform(MockMvcRequestBuilders.get("/blog"))
                .andExpect(status().isOk())
                .andExpect(view().name("blog"));
    }

    @Test
    void shouldReturnHomePageView() throws Exception {
        mockMvc
                .perform(MockMvcRequestBuilders.get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("start"));
    }

    @Test
    void shouldReturnDisorderViewWithPrefilledData() throws Exception {

        Disorder depression = new Disorder();
        depression.setName("Depression");
        depression.setDescription("A group of conditions associated with the elevation or lowering of a person's mood, such as depression or bipolar disorder.");

        List<Disorder> disorders = new ArrayList<>();
        disorders.add(depression);

        when(disorderService.fetchAllDisorders()).thenReturn(disorders);

        mockMvc
                .perform(MockMvcRequestBuilders.get("/disorders"))
                .andExpect(status().isOk())
                .andExpect(view().name("disorders"))
                .andExpect(model().attributeExists("disorders"));
    }
}
