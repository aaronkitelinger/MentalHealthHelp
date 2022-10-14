package com.mentalhealthapi.mentalhealthapi;

import com.mentalhealthapi.mentalhealthapi.dto.Disorder;
import com.mentalhealthapi.mentalhealthapi.service.IDisorderService;
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
