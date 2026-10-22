package com.sarahcole.taskmanager;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController 
public class TaskController {

    @GetMapping("/hello") 
    public String sayHello() {
        return "Hello from my Task Manager API!";
    }
    @GetMapping("/tasks")
    public Task getTask() {
        return new Task(1, "Finish Java project", false);
        
    }
}
