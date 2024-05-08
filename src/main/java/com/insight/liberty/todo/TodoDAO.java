package com.insight.liberty.todo;

public interface TodoDAO {

    Iterable<Todo> findAll();

    Todo findById(long id);

    Todo create(Todo todo);

    Todo update(Todo todo);

    void delete(Todo todo);

}
