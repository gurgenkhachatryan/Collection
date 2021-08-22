package com.company.Stack;

import java.security.PublicKey;

public class MySingleList<T> implements MyList<T> {
    public Node<T> first;
    public Node<T> last;
    public Node<T> current;
    int size;

    @Override
    public void addFist(T obj) {
        Node<T> node = new Node<>(obj);
        if (first == null) {
            first = node;
            last = node;
            size++;
            return;
        }
        node.next = first;
        first = node;
        size++;
        return;
    }

    @Override
    public void addLast(T obj) {
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

    }

    @Override
    public void remove(int index) {
        chekIndex(index);
        if (index == 0) {
            first = first.next;
            size--;
            return;
        }
        current = first;
        for (int i = 0; i < index; i++) {

            if (i == index - 1) {
                current.next = current.next.next;
                if (current.next == null) {
                    last = current;
                }
                size--;
                return;
            }
            current = current.next;

        }
    }

    void chekIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public int size() {
        return size;
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
    public int getIndex(T obj) {
        current = first;
        for (int i = 0; i < size; i++) {
            if (obj.equals(current.value)) {
                return i;

            }
            current = current.next;
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        current = first;
        for (int i = 0; i < size; i++) {
            result.append(current.value);
            if (i < size - 1) {
                result.append(',');
            }
            current = current.next;
        }
        result.append(']');
        return result.toString();
    }
}
