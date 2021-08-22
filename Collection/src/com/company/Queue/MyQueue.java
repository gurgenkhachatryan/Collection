package com.company.Queue;

import com.company.Stack.MySingleList;

public class MyQueue<T> implements Queue<T> {
    MySingleList mySingleList = new MySingleList();

    @Override
    public void offer(T obj) {

        if (obj == null) {
            throw new RuntimeException("object is not null");
        }
        mySingleList.addFist(obj);
    }

    @Override
    public T peek() {
        return (T) mySingleList.last.value;
    }

    @Override
    public int size() {
        return mySingleList.size();
    }

    @Override
    public T poll() {

        T k = (T) mySingleList.get(size() - 1);
        mySingleList.remove(size() - 1);
        return k;
    }


    @Override
    public int search(T obj) {

        return mySingleList.getIndex(obj);
    }

    @Override
    public String toString() {
        return mySingleList.toString();
    }
}
