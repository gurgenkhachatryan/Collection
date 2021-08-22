package com.company.CircleList;

public class Main {
    public static void main(String[] args) {
        MyCircleList<Integer> myCircleList=new MyCircleList<>();
        myCircleList.addLast(1);
        myCircleList.addLast(2);
        myCircleList.addLast(3);
        myCircleList.addLast(4);
//        myCircleList.addFirst(5);
//        myCircleList.addFirst(6);
//        myCircleList.addFirst(7);
//        myCircleList.addFirst(8);
        myCircleList.addMiddle(10,3);
    }
}
