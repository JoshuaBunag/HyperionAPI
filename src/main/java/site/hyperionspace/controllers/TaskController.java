package site.hyperionspace.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import site.hyperionspace.models.Task;
import site.hyperionspace.services.TaskService;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    private final TaskService taskService;


    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Task>> getAllTask() {
        List<Task> tasks = taskService.getAllTask();
        return new ResponseEntity<List<Task>>(tasks, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Task> createNewTask(@RequestBody Task task) {
        Task newTask = taskService.createTask(task);
        return new ResponseEntity<>(task, HttpStatus.CREATED);
    }
}
