package com.insight.liberty.todo;

import com.insight.liberty.todo.api.CollectionEnvelope;
import jakarta.annotation.Resource;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;

@RequestScoped
@Resource
@Path("/todos")
public class TodoResource {

    private TodoService todoService;

    public TodoResource() {}

    @Inject
    public void setTodoService(TodoService todoService) {
        this.todoService = todoService;
    }

    @GET
    @Produces("application/json")
    @Transactional
    public CollectionEnvelope<Todo> findAll() {
        return new CollectionEnvelope<>(todoService.findAll());
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Transactional
    public Todo create(Todo todo) {
        return todoService.save(todo);
    }
}
