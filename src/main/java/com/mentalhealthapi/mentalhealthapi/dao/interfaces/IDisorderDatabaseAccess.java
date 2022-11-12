package com.mentalhealthapi.mentalhealthapi.dao.interfaces;

import com.mentalhealthapi.mentalhealthapi.dto.Disorder;

import java.util.List;

public interface IDisorderDatabaseAccess {

    /**
     * Fetch all disorders.
     * @return a list of disorders.
     */
    List<Disorder> fetchAll();
}
