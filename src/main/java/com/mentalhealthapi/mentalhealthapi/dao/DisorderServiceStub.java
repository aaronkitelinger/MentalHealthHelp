package com.mentalhealthapi.mentalhealthapi.dao;

import com.mentalhealthapi.mentalhealthapi.dto.Disorder;
import com.mentalhealthapi.mentalhealthapi.service.IDisorderService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DisorderServiceStub implements IDisorderService {

    /**
     * Fetch all disorders
     *
     * @return
     */
    @Override
    public List<Disorder> fetchAllDisorders() {
        Disorder depression = new Disorder();
        depression.setName("Depression");
        depression.setDescription("A group of conditions associated with the elevation or lowering of a person's mood, such as depression or bipolar disorder.");

        Disorder bipolar = new Disorder();
        bipolar.setName("Bipolar Disorder");
        bipolar.setDescription("Someone with bipolar disorder, which is also sometimes called \"manic depression,\" has mood episodes that range from extremes of high energy with an \"up\" mood to low \"depressive\" periods.");

        List<Disorder> disorders = new ArrayList<>();
        disorders.add(depression);
        disorders.add(bipolar);

        return disorders;
    }
}
