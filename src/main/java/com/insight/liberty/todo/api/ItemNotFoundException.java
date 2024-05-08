package com.insight.liberty.todo.api;

public class ItemNotFoundException extends RuntimeException {

    public ItemNotFoundException(final String message) {
        super(message);
    }
}
