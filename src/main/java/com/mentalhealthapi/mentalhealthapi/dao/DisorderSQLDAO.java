package com.mentalhealthapi.mentalhealthapi.dao;

import com.mentalhealthapi.mentalhealthapi.dao.interfaces.IDisorderDatabaseAccess;
import com.mentalhealthapi.mentalhealthapi.dto.Disorder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("DisorderDAO")
public class DisorderSQLDAO implements IDisorderDatabaseAccess {



    @Autowired
    DisorderRepository disorderRepository;

    @Override
    public void delete(int id) throws Exception {
        disorderRepository.deleteById(id);

    }

    @Override
    public List<Disorder> fetchAll() {


        List<Disorder> allDisorders = new ArrayList<>();
        Iterable<Disorder> disorders = disorderRepository.findAll();
        for (Disorder disorder : disorders){
            allDisorders.add(disorder);
        }


        return allDisorders;
    }

    public Disorder fetch(int id){

        return disorderRepository.findById(id).get();

    }

    @Override
    public Disorder GetDisorder(int id) {

        return disorderRepository.findById(id).get();

    }

    @Override
    public Disorder Edit(Disorder disorder) {
        return null;
    }

    @Override
    public Disorder save(Disorder disorder) {
        Disorder createdDisorder = disorderRepository.save(disorder);
        return createdDisorder;
    }
}
