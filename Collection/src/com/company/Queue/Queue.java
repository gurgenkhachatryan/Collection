package com.company.Queue;

public interface Queue<T> {
    void offer(T obj);
    T    peek();
    T   poll ();
    int  size();
     int search(T obj);
     //void isEmpty();


}
