package com.km.api.service;

import com.km.api.model.Todo;

import java.util.List;

public interface ITodoService {

    List<Todo> findAll();

    Todo save(Todo todo);

    void deleteById(Long id);


}
