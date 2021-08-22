package com.company.Queue;

public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue=new MyQueue<>();
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        myQueue.offer(4);
        myQueue.offer(5);
       System.out.println(myQueue.toString());
   //     System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.toString());
      //  System.out.println(myQueue.peek());
       System.out.println(myQueue.poll());
        System.out.println(myQueue.toString());
        //  System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.toString());
        //  System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());


    }
}
