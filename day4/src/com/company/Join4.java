package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Join4 <T> {

  public static void main(String[] args) {
    ArrayList <String> arrayList=new ArrayList<>();
    ADD add=new ADD();
    System.out.println(add.ad1().toString());
    System.out.println(add.ad2().toString());
    ArrayList<String> arrayList1=new ArrayList<>();
    arrayList1= add.ad1();
    ArrayList<String> arrayList2=new ArrayList<>();
    arrayList2= add.ad2();
    String[] str=new String[4];
    for(int i=0;i<arrayList1.size();i++)
{
  str[i]=arrayList1.get(i);
}

  }
}
