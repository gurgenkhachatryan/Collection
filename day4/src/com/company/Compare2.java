package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Compare2<T>{
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("tree");
        arrayList.add("four");
        System.out.println(arrayList.toString());
        ArrayList<String> arrayList1=new ArrayList<>();
        arrayList1.add("one");
        arrayList1.add("tw");
        arrayList1.add("tree");
        arrayList1.add("four");
        System.out.println(arrayList1.toString());
    //    boolean flag=false;
        for(int i=0;i< arrayList.size();i++)
        {
            if(!(arrayList.get(i).compareTo(arrayList1.get(i))==0))
            {
                System.out.println("array not equal");
                return;
            }

        }
        System.out.println("yes array equal");
    }
}
