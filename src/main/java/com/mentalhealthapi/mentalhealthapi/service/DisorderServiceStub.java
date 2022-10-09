package com.mentalhealthapi.mentalhealthapi.service;

import com.mentalhealthapi.mentalhealthapi.dto.Disorder;
import org.springframework.stereotype.Component;

@Component
public class DisorderServiceStub implements com.mentalhealthapi.mentalhealthapi.service.IDisorderService {

    @Override
    public Disorder fetchbyName(String name) {
        return null;
    }
}
