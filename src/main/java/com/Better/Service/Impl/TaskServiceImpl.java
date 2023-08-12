package com.Better.Service.Impl;
import com.Better.Models.Category;
import com.Better.Models.Tasks;
import com.Better.Payloads.ApiResponse;
import com.Better.Repository.CategoryRepo;
import com.Better.Repository.TaskRepo;
import com.Better.Service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskRepo taskRepo;
    private final CategoryRepo categoryRepo;
    @Override
    public ResponseEntity<?> createPost(Tasks tasks) {
        this.taskRepo.save(tasks);
        return new ResponseEntity<>(new ApiResponse("Your tasks has been created", false), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(this.taskRepo.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> createPost(Category category) {
        this.categoryRepo.save(category);
        return new ResponseEntity<>(new ApiResponse("The category has been created", true), HttpStatus.OK);
    }
}
