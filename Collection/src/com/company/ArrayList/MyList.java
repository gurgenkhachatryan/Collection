package com.company.ArrayList;

public interface MyList<T> {
    T get(int index);
    void add(T obj);
    boolean remove(T obj);
    void remove(int index);
    int size();
    boolean contains(T obj);
     int indexOf(T obj);
}
