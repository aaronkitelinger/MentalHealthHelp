package com.mentalhealthapi.mentalhealthapi.dao;
import com.mentalhealthapi.mentalhealthapi.dto.Blog;
import org.springframework.data.repository.CrudRepository;

public interface BlogRepository extends CrudRepository<Blog, Integer> {
}
