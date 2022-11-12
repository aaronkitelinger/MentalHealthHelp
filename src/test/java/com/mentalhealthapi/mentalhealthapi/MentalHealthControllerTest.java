package com.mentalhealthapi.mentalhealthapi;
import com.mentalhealthapi.mentalhealthapi.dao.interfaces.IBlogDatabaseAccess;
import com.mentalhealthapi.mentalhealthapi.dto.Blog;
import com.mentalhealthapi.mentalhealthapi.dto.Disorder;
import com.mentalhealthapi.mentalhealthapi.service.BlogService;
import com.mentalhealthapi.mentalhealthapi.service.interfaces.IBlogService;
import com.mentalhealthapi.mentalhealthapi.service.interfaces.IDisorderService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(MentalHealthController.class)
public class MentalHealthControllerTest {

    @Autowired
    MockMvc mockMvc;
    @MockBean
    IDisorderService disorderService;
    @MockBean
    IBlogService blogService;
    @MockBean
    IBlogDatabaseAccess blogDAO;

    Blog mockBlog = createMockBlog();

    private Blog createMockBlog() {
        Blog mockBlog = new Blog();
        mockBlog.setDisorderName("TEST");
        mockBlog.setTitle("TITLE HERE");
        mockBlog.setBody("This is the body text of this blog. Example Text: A group of conditions associated with the elevation or lowering of a person's mood, such as depression or bipolar disorder.");
        return mockBlog;
    }

    @Test
    void shouldReturnBlogViewWithPrefilledData() throws Exception {
        List<Blog> blogs = new ArrayList<>();
        blogs.add(mockBlog);

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

        when(disorderService.fetchAll()).thenReturn(disorders);

        mockMvc
                .perform(MockMvcRequestBuilders.get("/disorders"))
                .andExpect(status().isOk())
                .andExpect(view().name("disorders"))
                .andExpect(model().attributeExists("disorders"));
    }

    @Test
    void shouldCreateBlogPostByUser() throws Exception {
        when(blogDAO.save(mockBlog)).thenReturn(mockBlog);
        blogService = new BlogService(blogDAO);

//        mockMvc
//                .perform(MockMvcRequestBuilders.post("/blog"))
//                .andExpect(status().isOk());

        Blog newBlog = blogService.save(mockBlog);
        assertEquals(mockBlog, newBlog);
        verify(blogDAO, atLeastOnce()).save(mockBlog);
    }

    @Test
    void shouldDeleteBlogPostByUser() throws Exception {
        mockMvc
                .perform(MockMvcRequestBuilders.delete("/blog/1/"))
                .andExpect(status().isOk());
    }
}
