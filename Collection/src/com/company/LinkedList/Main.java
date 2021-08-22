package com.company.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedExemple<Integer> linkedExemp=new LinkedExemple<>();
        linkedExemp.add(15);
        linkedExemp.add(26);
        linkedExemp.add(37);
        linkedExemp.add(48);
        System.out.println(linkedExemp.toString());
//        System.out.println(linkedExemp.get(0));
//        linkedExemp.remove(0);
//        System.out.println(linkedExemp.toString());
//        linkedExemp.removeObj(37);
//        System.out.println(linkedExemp.toString());
        System.out.println(linkedExemp.indexOf(26));
        System.out.println(linkedExemp.removeObj(15));
        System.out.println(linkedExemp.toString());
        System.out.println(linkedExemp.contains(4));


    }
}
