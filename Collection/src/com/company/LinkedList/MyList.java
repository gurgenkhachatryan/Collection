package com.company.LinkedList;

public interface MyList<T> {
    void add(T obj);
    T  get(int index);
    void remove(int index);
    boolean removeObj(T obj);
    int size();
    boolean contains(T obj);
    int indexOf(T obj);
    String toString();
}
