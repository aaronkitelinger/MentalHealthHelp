package com.mentalhealthapi.mentalhealthapi.service;

import com.mentalhealthapi.mentalhealthapi.dto.Disorder;
import org.springframework.stereotype.Component;

@Component
public class DisorderServiceSub implements IDisorderService {

    /**
     * Fetch disorder given id
     *
     * @param id
     * @return
     */
    @Override
    public Disorder fetchById(int id) {
        Disorder disorder = new Disorder();
        disorder.setName("Bipolar Disorder");
        return disorder;
    }
}
