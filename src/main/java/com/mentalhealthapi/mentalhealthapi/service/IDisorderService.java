package com.mentalhealthapi.mentalhealthapi.service;

import com.mentalhealthapi.mentalhealthapi.dto.Disorder;

public interface IDisorderService {

    /**
     * Fetch disorder given id
     * @param id
     * @return
     */
    Disorder fetchById(int id);
}
