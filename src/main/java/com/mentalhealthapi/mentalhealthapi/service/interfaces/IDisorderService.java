package com.mentalhealthapi.mentalhealthapi.service.interfaces;

import com.mentalhealthapi.mentalhealthapi.dto.Disorder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IDisorderService {


    /*
     * Delete a disorder
     * @param id of disorder wanted to delete
    */
    void DeleteDisorderById(int id) throws Exception;


    /*
     * Fetch all disorders
     * @return a list of disorders.
     */
    List<Disorder> fetchAll();
}
