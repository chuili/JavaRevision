package com.java.revision.linkedlist;

public class Node<T> {
    private T value;
    Node next;

    public Node(final T value) {
        this.value = value;
        this.next = null;
    }

    public T getValue() {
        return this.value;
    }
}
