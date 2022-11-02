package com.mentalhealthapi.mentalhealthapi.dao;

import com.mentalhealthapi.mentalhealthapi.dto.Disorder;

import java.util.List;

public interface IDisorderDatabaseAccess {

    /**
     * Fetch all disorders.
     * @return
     */
    List<Disorder> fetchAll();
}
