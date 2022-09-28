package com.mentalhealthapi.mentalhealthapi.Service;

import com.mentalhealthapi.mentalhealthapi.dto.Disorder;

public interface IDisorderService {
    /**
     * get the name of a disorder
     * @param i = a string of a name of the disorder
     * @return that matching disorder or null if it doesnt exist
     */
    Disorder fetchbyName(String i);

}
