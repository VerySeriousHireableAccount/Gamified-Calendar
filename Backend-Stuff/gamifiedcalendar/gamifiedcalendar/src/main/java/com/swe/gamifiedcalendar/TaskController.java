package com.swe.gamifiedcalendar;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class TaskController {

    private final TaskRepository repository;

    TaskController(TaskRepository repository) {
        this.repository = repository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/Tasks")
    List<Task> all() {
        return (List<Task>) repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/Tasks")
    Task newTask(@RequestBody Task newTask) {
        return repository.save(newTask);
    }

    @GetMapping("/Tasks/{id}")
    List<Task> allForAccount(@PathVariable Long id){
        return null;
    }

    @DeleteMapping("/Tasks/{id}")
    void deleteTask(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
