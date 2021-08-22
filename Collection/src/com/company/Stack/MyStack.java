package com.company.Stack;

public class MyStack<T> implements StackInt<T> {
    MySingleList mySingleList = new MySingleList();

    @Override
    public void push(T obj) {
        if(obj==null)
        {
            throw new RuntimeException("object can't null");
        }
        mySingleList.addFist(obj);
    }

    @Override
    public void pop() {
        if(isEmpty())
        {
            throw new RuntimeException("stack is empty");
        }
        mySingleList.remove(0);

    }

    @Override
    public boolean isEmpty() {
        if (mySingleList.size() == 0) {
            System.out.println("stack is empty");
            return true;
        } else {
            System.out.println("stack is not empty");
            return false;
        }
    }

    @Override
    public int search(T obj) {
      return mySingleList.getIndex(obj);

    }

    @Override
    public T peak() {

        return (T) mySingleList.get(0);
    }

    @Override
    public String toString() {
        return mySingleList.toString();
    }
}