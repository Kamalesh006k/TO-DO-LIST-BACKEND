package com.example.to_do_list.Repository;

import com.example.to_do_list.Models.todolist;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface todorepository extends MongoRepository<todolist, String> {
}
