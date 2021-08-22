package com.company.Stack;

public interface StackInt<T> {
    void push(T obj);
    void pop();
    boolean isEmpty();
    int search(T obj);
    T peak();

}
