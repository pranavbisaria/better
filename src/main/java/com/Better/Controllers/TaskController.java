package com.Better.Controllers;

import com.Better.Models.Posts;
import com.Better.Models.Tasks;
import com.Better.Service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/tasks")
public class TaskController {
    private final TaskService taskService;
    @PostMapping("/create")
    ResponseEntity<?> createPost(@RequestBody Tasks tasks){
        return this.taskService.createPost(tasks);
    }

    @GetMapping("")
    ResponseEntity<?> createPost(){
        return this.taskService.getAll();
    }
}
