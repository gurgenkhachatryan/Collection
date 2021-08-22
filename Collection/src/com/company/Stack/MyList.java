package com.company.Stack;

public interface MyList<T>  {
    void addFist(T obj);
    void addLast(T obj);
    void remove(int index);
    int size();
    T get(int index);
    int getIndex(T obj);




}
