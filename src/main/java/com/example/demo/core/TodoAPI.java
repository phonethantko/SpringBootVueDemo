package com.example.demo.core;

import com.example.demo.core.model.Todo;
import com.example.demo.core.service.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class TodoAPI {

    @Autowired
    private TodoService todoService;

    @GetMapping("/api/todos")
    public List<Todo> findTodos() {
        return todoService.findAll();
    }

    @PostMapping(path = "/api/todos", consumes = "application/json")
    public ResponseEntity saveTodo(@Valid @RequestBody Todo todo) {
        todoService.save(todo);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
