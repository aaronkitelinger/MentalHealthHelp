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
    void fetchdisorderbyName_returnsdepression(){
        DataAvailable();
        whenSearchDisorderWithNameDepression();
        ReturnsDepressionForNameDepression();
    }

    private void DataAvailable() {
    }

    private void whenSearchDisorderWithNameDepression() {
        disorder = disorderService.fetchbyName("Depression");
    }

    private void ReturnsDepressionForNameDepression() {
        String name = disorder.getName();
        assertEquals("Should be Depression","Depression",name);
    }
    @Test
    void CreateUserandReturnUsername(){
        GetUserInfoFromView();
        CreateUser();
        ReturnInfomationretrievedfromView();
    }

    private void GetUserInfoFromView() {

    }


    private void CreateUser() {

    }


    private void ReturnInfomationretrievedfromView() {
    }




}
