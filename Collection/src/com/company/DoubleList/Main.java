package com.company.DoubleList;

public class Main {
    public static void main(String[] args) {
        MyDoubleList<Integer> myDoubleList=new MyDoubleList<>();
        myDoubleList.addLast(11);
        myDoubleList.addLast(25);
        myDoubleList.addLast(36);
        myDoubleList.addFirst(null);
        myDoubleList.addFirst(26);
        myDoubleList.addFirst(37);
        System.out.println(myDoubleList);
  //      System.out.println("index=" + myDoubleList.indexOf(25));
//        System.out.println("size=" + myDoubleList.size());
//        System.out.println("contains= 25 = " + myDoubleList.contains(25));
//        System.out.println(myDoubleList.toString());
        System.out.println(myDoubleList.indexOf(25));
  //      myDoubleList.remove(2);
        myDoubleList.removeObj(26);
    }
}
