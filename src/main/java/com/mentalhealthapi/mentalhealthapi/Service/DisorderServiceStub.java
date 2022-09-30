package com.mentalhealthapi.mentalhealthapi.Service;

import com.mentalhealthapi.mentalhealthapi.dto.Disorder;
import org.springframework.stereotype.Component;

@Component
public class DisorderServiceStub implements IDisorderService {

    @Override
    public Disorder fetchByName(String name) {
        return null;
    }
}
