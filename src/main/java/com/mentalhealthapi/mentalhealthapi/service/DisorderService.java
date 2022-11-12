package com.mentalhealthapi.mentalhealthapi.service;

import java.util.List;

import com.mentalhealthapi.mentalhealthapi.dao.interfaces.IDisorderDatabaseAccess;
import com.mentalhealthapi.mentalhealthapi.dto.Disorder;
import com.mentalhealthapi.mentalhealthapi.service.interfaces.IDisorderService;

public class DisorderService implements IDisorderService {

    private IDisorderDatabaseAccess disorderDAO;

    public DisorderService(IDisorderDatabaseAccess disorderDAO) {
        this.disorderDAO = disorderDAO;
    }

    @Override
    public List<Disorder> fetchAll() {
        return disorderDAO.fetchAll();
    }
    
}
