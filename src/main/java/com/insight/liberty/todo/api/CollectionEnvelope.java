package com.insight.liberty.todo.api;

public record CollectionEnvelope<T>(Iterable<T> data) {
}
