package com.mentalhealthapi.mentalhealthapi.service;

import com.mentalhealthapi.mentalhealthapi.dto.Disorder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DisorderServiceStub implements IDisorderService {
    @Override
    public List<Disorder> fetchAllDisorders() {
        //creates a new Disorder named depression
        //sets name and description for depression
        Disorder depression = new Disorder();
        depression.setName("Depression");
        depression.setDescription("A group of conditions associated with the elevation or lowering of a person's mood, such as depression or bipolar disorder.");

        //creates a new Disorder named bipolar
        //sets name and description for bipolar
        Disorder bipolar = new Disorder();
        bipolar.setName("Bipolar Disorder");
        bipolar.setDescription("Someone with bipolar disorder, which is also sometimes called \"manic depression,\" has mood episodes that range from extremes of high energy with an \"up\" mood to low \"depressive\" periods.");

        //creates a list with the populated disorders
        List<Disorder> disorders = new ArrayList<>();
        disorders.add(depression);
        disorders.add(bipolar);

        //return list of disorders to display on the disorders page
        return disorders;
    }
}
