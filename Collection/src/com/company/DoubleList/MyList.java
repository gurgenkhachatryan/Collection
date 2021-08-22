package com.company.DoubleList;

public interface MyList<T> {
    T get(int index);
    void  addFirst(T obj);
    void addLast(T obj);
    int indexOf(T obj);
    void remove(int index);
    boolean removeObj(T obj);
    int size();
    boolean contains(T obj);
     String toString() ;
}
