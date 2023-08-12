package com.Better.Service;

import com.Better.Models.Tasks;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;

public interface TaskService {
    ResponseEntity<?> createPost(Tasks tasks);
    ResponseEntity<?> getAll();
}
