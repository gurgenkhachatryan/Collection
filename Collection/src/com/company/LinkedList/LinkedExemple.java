package com.company.LinkedList;

public class LinkedExemple<T> implements MyList<T> {
    Node<T> first;
    Node<T> last;
    int size;
    Node<T> current;

    @Override
    public void add(T obj) {
        Node<T> node = new Node<>(obj);
        if (first == null) {
            first = node;
            last = node;
            size++;
            return;
        }
        last.next = node;
        last = node;
        size++;
        return;
    }

    @Override
    public T get(int index) {
        current = first;
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                break;
            }
            current = current.next;
        }
        return current.value;
    }

    @Override
    public void remove(int index) {
        current = first;
        checkIndex(index);
        if (index == 0) {
            first = first.next;
            last = first;
            size--;
            return;
        }
        for (int i = 0; i < index; i++) {
            if (i != index - 1) {
                current = current.next;
            }
            current.next = current.next.next;
            size--;
            last = current;
        }

    }

    @Override
    public boolean removeObj(T obj) {
        current = first;
        boolean flag = false;
        int ind = indexOf(obj);
        if (ind == 0) {
            first = first.next;
            last = first;
            size--;
            flag = true;
        }
        for (int i = 0; i < size; i++) {
            if (current.next.value.equals(obj)) {
                current.next = current.next.next;
                size--;
                flag = true;
                break;
            }
            current = current.next;
        }

        return flag;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(T obj) {
        boolean flag = false;
        current = first;
        for (int i = 0; i < size; i++) {
            if (current.value.equals(obj)) {
                flag = true;
                break;
            }
            current = current.next;
            if (current.next == null) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    @Override
    public int indexOf(T obj) {
        current = first;
        for (int i = 0; i < size; i++) {
            if (current.value.equals(obj)) {
                return i;
            }
            current = current.next;

        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        current = first;
        for (int i = 0; i < size; i++) {
            stringBuilder.append(current.value);
            if (i < size - 1) {
                stringBuilder.append(',');
                current = current.next;
            }
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index bound!!!");
        }
    }
}