package com.mentalhealthapi.mentalhealthapi;

import com.mentalhealthapi.mentalhealthapi.Service.IDisorderService;
import com.mentalhealthapi.mentalhealthapi.dto.Disorder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
class MentalHealthApiApplicationTests {

        @Autowired
         private IDisorderService disorderService;
         private Disorder disorder;
    @Test
    void contextLoads() {
    }

    @Test
    void fetchdisorderbyID1_returnsdepression(){
        DataAvailable();
        whenSearchDisorderWithID1();
        ReturnsDepressionForID1();
    }

    private void DataAvailable() {
    }

    private void whenSearchDisorderWithID1() {
        disorder = disorderService.fetchbyName("Depression");
    }

    private void ReturnsDepressionForID1() {
        String name = disorder.getName();
        assertEquals("Should be Depression","Depression",name);
    }
}
