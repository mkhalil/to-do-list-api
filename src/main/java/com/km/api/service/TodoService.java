package com.km.api.service;

import com.km.api.model.Todo;
import com.km.api.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService implements ITodoService{

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    @Override
    public List<Todo> findAll() {
        return this.todoRepository.findAll();
    }

    @Override
    public Todo save(Todo todo) {
        return this.todoRepository.save(todo);
    }

    @Override
    public void deleteById(Long id) {
        this.todoRepository.deleteById(id);
    }
}
