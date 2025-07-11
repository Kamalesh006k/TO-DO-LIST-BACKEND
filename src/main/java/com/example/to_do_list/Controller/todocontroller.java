package com.example.to_do_list.Controller;

import com.example.to_do_list.Models.todolist;
import com.example.to_do_list.Service.todoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class todocontroller {

    @Autowired
    private todoservice todoservice;

    @GetMapping("/tasks")
    public List<todolist> getAllTasks() {
        return todoservice.gettasks();
    }

    @PostMapping("/addtask")
    public List<todolist> addTask(@RequestBody todolist task) {
        todoservice.addtask(task);
        return todoservice.gettasks();
    }

    @DeleteMapping("/tasks/{id}")
    public String deleteTask(@PathVariable String id) {
        todoservice.deletetask(id);
        return "Task deleted successfully";
    }

    @PutMapping("/tasks/{id}/finish")
    public String markTaskAsFinished(@PathVariable String id) {
        todoservice.markAsFinished(id);
        return "Task marked as finished";
    }

}
