package com.mentalhealthapi.mentalhealthapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(MentalHealthController.class)
public class MentalHealthControllerTest {

    @Autowired
    MockMvc mockMvc;

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


        mockMvc
                .perform(MockMvcRequestBuilders.get("/disorders"))
                .andExpect(status().isOk())
                .andExpect(view().name("disorders"))
                .andExpect(model().attributeExists("disorders"));
    }


}
