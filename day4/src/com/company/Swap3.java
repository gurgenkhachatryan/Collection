package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Swap3<T> {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(5);
        arrayList.add(16);
        arrayList.add(27);
        arrayList.add(38);
        System.out.println(arrayList.toString());
        Collections.swap(arrayList,1,3);
        System.out.println(arrayList.toString());
    }
}
