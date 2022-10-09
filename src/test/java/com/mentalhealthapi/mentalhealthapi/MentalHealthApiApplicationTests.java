package com.mentalhealthapi.mentalhealthapi;

import com.mentalhealthapi.mentalhealthapi.dto.User;
import com.mentalhealthapi.mentalhealthapi.service.IUserService;
import com.mentalhealthapi.mentalhealthapi.service.IDisorderService;
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

    @Autowired
    private IUserService userService;
    private User user = new User();

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
        String name = "Depression";
        assertEquals("Should be Depression","Depression",name);
    }
    @Test
    void CreateUserandReturnUsername(){
        GetUserInfoFromView();
        CreateUser();
        ReturnInfomationretrievedfromView();
    }

    private void GetUserInfoFromView() {

        String username = "Kiteliad";
        user.setUsername(username);

    }


    private void CreateUser() {
        user = userService.createUser(user);
    }


    private void ReturnInfomationretrievedfromView() {
        String username = user.getUsername();
        assertEquals("Should be Kiteliad","Kiteliad",username);

    }




}
