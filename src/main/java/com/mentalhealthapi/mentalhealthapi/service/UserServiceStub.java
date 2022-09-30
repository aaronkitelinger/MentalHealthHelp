package com.mentalhealthapi.mentalhealthapi.Service;

import com.mentalhealthapi.mentalhealthapi.dto.User;
import org.springframework.stereotype.Component;

@Component
public class UserServiceStub implements IUserService {


    @Override
    public User createUser(User user) {
        return user;
    }
}

