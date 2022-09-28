package com.mentalhealthapi.mentalhealthapi.Service;

import com.mentalhealthapi.mentalhealthapi.dto.Disorder;
import org.springframework.stereotype.Component;

@Component
public class DisorderServiceStub implements IDisorderService{
    @Override
    public Disorder fetchbyName(String i) {
        Disorder disorder = new Disorder();
        disorder.setName("Depression");
        return disorder;

    }
}
