package com.mentalhealthapi.mentalhealthapi.Service;

import com.mentalhealthapi.mentalhealthapi.dto.Disorder;

public interface IDisorderService {

    Disorder fetchbyName(String name);
}
