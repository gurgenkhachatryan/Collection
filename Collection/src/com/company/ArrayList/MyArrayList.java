package com.company.ArrayList;

public class MyArrayList <T>implements MyList<T>{
    private Object[] array;
    private int cursor;
    private int capacity;
    private static  final int Factor=5;

    public MyArrayList() {
        array=new Object[capacity];
        cursor = 0;
         capacity=Factor;
    }
void checkIndex(int index)
{
    if(index<0 || index>=cursor)
    {
        throw new IndexOutOfBoundsException();
    }
}
    @Override
    public T get(int index) {
        return null;
    }
public void growArray()
{
    capacity=cursor+Factor;
    Object[] newArray=new Object[capacity];
    System.arraycopy(array,0,newArray,0,cursor);
    array=newArray;
}

    @Override
    public void add(T obj) {
        if(cursor==capacity-1)
        {
         growArray();
         array[cursor++]=obj;
        }

    }

    @Override
    public boolean remove(T obj) {
        int index=indexOf(obj);
        if(index!=-1)
        {
            remove(index);
            return true;
        }
            return false;

    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        for (int i=index;i<cursor-1;i++)
        {
            array[i]=array[i+1];
        }
cursor--;
    }

    @Override
    public int size() {
        return cursor;
    }

    @Override
    public boolean contains(T obj) {

        return indexOf(obj)!=-1;
    }

    @Override
    public int indexOf(T obj) {
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(obj))
            {
                return i;
            }
            if(array[i]==obj)
            {
                return i;
            }
        }
        return -1;
    }

}
