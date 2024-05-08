package com.insight.liberty.todo;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@RequestScoped
public class TodoDAOImpl implements TodoDAO {

    private EntityManager em;

    @PersistenceContext(name = "jpa-unit")
    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Override
    public Iterable<Todo> findAll() {
        return em.createNamedQuery("Todo.findAll", Todo.class).getResultList();
    }

    @Override
    public Todo findById(long id) {
        return em.find(Todo.class, id);
    }

    @Override
    public Todo create(Todo todo) {
        em.persist(todo);
        return em.find(Todo.class, todo.getId());
    }

    @Override
    public Todo update(Todo todo) {
        return em.merge(todo);
    }

    @Override
    public void delete(Todo todo) {
        em.remove(todo);
    }
}
