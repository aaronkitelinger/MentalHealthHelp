package com.mentalhealthapi.mentalhealthapi.Service;

import com.mentalhealthapi.mentalhealthapi.dto.Disorder;
import org.springframework.stereotype.Component;

@Component
public class DisorderServiceStub implements com.mentalhealthapi.mentalhealthapi.Service.IDisorderService {

    @Override
    public Disorder fetchbyName(String name) {
        return null;
    }
}
