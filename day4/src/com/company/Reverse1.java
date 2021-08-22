package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse1<T> {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(25);
        arrayList.add(36);
        arrayList.add(47);
        arrayList.add(58);
        System.out.println(arrayList.toString());
        Collections.reverse(arrayList);
        System.out.println(arrayList);
    }
}


