package com.company.Stack;

public class Main {
    public static void main(String[] args) {
        MySingleList<Integer> mySingleList=new MySingleList<>();
        MyStack myStack=new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        System.out.println(myStack.toString());
        myStack.pop();
        System.out.println(myStack.toString());
        myStack.pop();
        System.out.println(myStack.toString());
        System.out.println(myStack.toString());
        myStack.pop();
        System.out.println(myStack.toString());
        myStack.pop();
        System.out.println(myStack.toString());
        System.out.println(myStack.toString());
        myStack.pop();
        System.out.println(myStack.toString());
        myStack.pop();
        System.out.println(myStack.toString());
        myStack.isEmpty();

        System.out.println(myStack.peak());
        System.out.println(myStack.search(2));


    }
}
