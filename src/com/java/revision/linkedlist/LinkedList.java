package com.java.revision.linkedlist;

public class LinkedList<T> {

    private Node head;
    private Node tail;
    private int length = 0;

    public LinkedList(final T value) {
        head = new Node(value);
        tail = head;
        length++;
    }

    public int getLength() {
        return length;
    }

    public void append(final T value) {
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        length++;
    }

    public void prepend(final T value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void insert(final int index, final T value) {
        if (index <= 0) {
            prepend(value);
            return;
        } else if (index >= length) {
            append(value);
            return;
        }

        Node newNode = new Node(value);
        Node leader = getNodeAtIndex(index - 1);
        newNode.next = leader.next;
        leader.next = newNode;
        length++;
    }

    public void remove(final int index) {
        Node leader;
        if (index < 0) {
            head = head.next;
            length--;
            return;
        }
        else if (index >= length) {
            leader = getNodeAtIndex(length - 2);
        }
        else {
            leader = getNodeAtIndex(index - 1);
        }
        Node toRemove = leader.next;
        leader.next = toRemove.next;
        length--;
    }

    public void reverse() {
        if (head.next == null) {
            return;
        }

        Node first = head;
        tail = head;
        Node second = first.next;
        Node temp;
        while (second != null) {
            temp = second.next;
            second.next = first;
            first = second;
            second = temp;
        }
        head.next = null;
        head = first;
    }

    private Node getNodeAtIndex(final int index) {
        Node node = head;
        int counter = 0;
        while (counter != index) {
            node = node.next;
            counter++;
        }
        return node;
    }

    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.println(node.getValue());
            node = node.next;
        }
    }
}
