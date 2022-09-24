package com.mentalhealthapi.mentalhealthapi;

import com.mentalhealthapi.mentalhealthapi.dto.Disorder;
import com.mentalhealthapi.mentalhealthapi.service.IDisorderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MentalHealthApiApplicationTests {

    @Autowired
    IDisorderService disorderService;
    private Disorder disorder;

    @Test
    void contextLoads() {
    }

    @Test
    void fetchDisorderById_ReturnBiPolarID1() {
        givenDisorderDataAreAvailble();
        whenSearchedDisorderID1();
        thenReturnBiPolarForID1();
    }

    private void givenDisorderDataAreAvailble() {
    }

    private void whenSearchedDisorderID1() {
        disorder = disorderService.fetchById(1);
    }

    private void thenReturnBiPolarForID1() {
        String name = disorder.getName();
        assertEquals("Bipolar Disorder", name);
    }

}
