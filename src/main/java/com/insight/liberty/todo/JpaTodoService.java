package com.insight.liberty.todo;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class JpaTodoService implements TodoService {

    private final TodoDAO todoDAO;

    @Inject
    public JpaTodoService(final TodoDAO todoDAO) {
        this.todoDAO = todoDAO;
    }

    @Override
    public Iterable<Todo> findAll() {
        return todoDAO.findAll();
    }

    @Override
    public Todo findById(long id) {
        return todoDAO.findById(id);
    }

    @Override
    public Todo save(Todo todo) {
        if (todo.getId() == 0L) {
            return todoDAO.create(todo);
        }
        return todoDAO.update(todo);
    }

    @Override
    public void deleteById(long id) {
        todoDAO.delete(findById(id));
    }
}
