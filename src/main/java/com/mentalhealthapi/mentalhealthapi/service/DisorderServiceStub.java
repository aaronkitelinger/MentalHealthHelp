package com.mentalhealthapi.mentalhealthapi.service;

import com.mentalhealthapi.mentalhealthapi.dao.DisorderDatabaseAccessStub;
import com.mentalhealthapi.mentalhealthapi.dao.IBlogDatabaseAccess;
import com.mentalhealthapi.mentalhealthapi.dao.IDisorderDatabaseAccess;
import com.mentalhealthapi.mentalhealthapi.dto.Disorder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DisorderServiceStub implements IDisorderService {

    private IDisorderDatabaseAccess disorderDAO;

    public DisorderServiceStub() {}
    public DisorderServiceStub(IDisorderDatabaseAccess disorderDAO) {
        this.disorderDAO = disorderDAO;
    }

    /**
     * Fetch all disorders
     *
     * @return a list of disorders.
     */
    @Override
    public List<Disorder> fetchAllDisorders() {
        return disorderDAO.fetchAll();
    }
}
