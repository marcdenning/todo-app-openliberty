package com.insight.liberty.todo;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "todos")
@NamedQuery(name = "Todo.findAll", query = "SELECT t FROM Todo t")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "description")
    private String description;

    @Column(name = "completed")
    private boolean completed = false;

    @Column(name = "due_date")
    private LocalDate dueDate;

    @Column(name = "priority")
    private int priority;

    public Todo() {
    }

    public Todo(long id, String description, boolean completed, LocalDate dueDate, int priority) {
        this.id = id;
        this.description = description;
        this.completed = completed;
        this.dueDate = dueDate;
        this.priority = priority;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return id == todo.id && completed == todo.completed && priority == todo.priority && Objects.equals(description, todo.description) && Objects.equals(dueDate, todo.dueDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, completed, dueDate, priority);
    }
}
