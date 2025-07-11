package com.example.to_do_list.Service;

import com.example.to_do_list.Models.todolist;
import com.example.to_do_list.Repository.todorepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class todoservice {

    @Autowired
    private todorepository todorepo;

    public List<todolist> gettasks() {
        return todorepo.findAll();
    }

    public void addtask(todolist task) {
        task.setStatus(false);
        todorepo.save(task);
    }

    public void deletetask(String id) {
        todorepo.deleteById(id);
    }

    public void markAsFinished(String id) {
        todolist task = todorepo.findById(id).orElse(null);
        if (task != null) {
            task.setStatus(!task.isStatus());
            todorepo.save(task);
        }
    }

}
