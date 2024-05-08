package com.insight.liberty.todo;

public interface TodoService {

    Iterable<Todo> findAll();

    Todo findById(long id);

    Todo save(Todo todo);

    void deleteById(long id);
}
