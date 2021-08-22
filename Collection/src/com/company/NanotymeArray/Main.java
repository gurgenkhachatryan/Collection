package com.company.NanotymeArray;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> strings=new ArrayList<>();
        for(int i=0;i<100000;i++)
        {
            strings.add("value" + i);
        }
        long start=System.nanoTime();
        String s=strings.get(0);
        long end=System.nanoTime();
        System.out.println("Get="+(end-start));

    }
}
