package com.mentalhealthapi.mentalhealthapi.service;

import com.mentalhealthapi.mentalhealthapi.dto.Disorder;

public interface IDisorderService {

    Disorder fetchbyName(String name);
}
