package com.mentalhealthapi.mentalhealthapi.service;

import com.mentalhealthapi.mentalhealthapi.dto.Disorder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IDisorderService {
    /**
     * Fetch all disorders
     * @return
     */
    List<Disorder> fetchAllDisorders();
}
