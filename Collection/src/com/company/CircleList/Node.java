package com.company.CircleList;

public class Node<T> {
    T value;
    Node<T> next;
    Node<T> preview;

    public Node(T value) {
        this.value = value;
    }
}
