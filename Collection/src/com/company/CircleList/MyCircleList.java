package com.company.CircleList;

public class MyCircleList <T>implements MyList<T>{
    Node<T> first;
    Node<T> last;
    Node<T> current;
    int size;

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public void addFirst(T obj) {
        Node<T> node=new Node<>(obj);
        if(first==null)
        {
            first=node;
            last=node;
            size++;
            return;
        }

        node.next=first;
        first.preview=node;
        first= node;
        first.preview=last;
        last.next=first;
        size++;


    }

    @Override
    public void addLast(T obj) {
        Node<T> node=new Node<>(obj);
        if(first==null)
        {
            first=node;
            last=node;
            size++;
            return;
        }
        node.preview=last;
      last.next=node;
        last=node;
        last.next=first;
        first.preview=last;
size++;

    }

    @Override
    public void addMiddle(T obj, int index) {
        checkIndex(index);
        if(index==0)
        {
            addFirst(obj);
            return;
        }
        else
            if(index==size-1)
            {
                addLast(obj);
                return;
            }
        Node<T> node=new Node<>(obj);
        current=first;

        for(int i=0;i<index-1;i++)
        {
            current=current.next;
        }
        node.next=current.next;
        current.next.preview=node;
        current.next=node;
        node.preview=current;
        size++;

    }

    @Override
    public int indexOf(T obj) {
        return 0;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public boolean removeObj(T obj) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean contains(T obj) {
        return false;
    }
    void  checkIndex(int i)
    {
        if(i<0 || i>=size)
        {
            throw new IndexOutOfBoundsException();
        }
    }
}
