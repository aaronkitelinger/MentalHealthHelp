package com.mentalhealthapi.mentalhealthapi.dao;

import com.mentalhealthapi.mentalhealthapi.dto.Disorder;
import org.springframework.data.repository.CrudRepository;

public interface DisorderRepository extends CrudRepository<Disorder, Integer> {


}
