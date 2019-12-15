package com.km.api.controller;

import com.km.api.model.Todo;
import com.km.api.service.ITodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/todos")
public class TodoController {

    private final
    ITodoService todoService;

    public TodoController(ITodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<Todo> findAll() {
        return todoService.findAll();
    }

    @PostMapping
    public Todo create(@RequestBody Todo todo) {
        return todoService.save(todo);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") Long id) {
        todoService.deleteById(id);
    }

    @PutMapping(value = "/{id}")
    public void update(@PathVariable("id") Long id, @RequestBody Todo todo) {
        todoService.save(todo);
    }
}
