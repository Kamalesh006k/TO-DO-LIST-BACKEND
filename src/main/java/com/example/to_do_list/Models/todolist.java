package com.example.to_do_list.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Tasks")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class todolist {

    @Id
    private String id;
    private String task;
    private boolean status;
}
