package com.company.DoubleList;

public class MyDoubleList<T> implements MyList<T> {
    Node<T> first;
    Node<T> last;
    int size;

    @Override
    public T get(int index) {
        checkIndex(index);
        if (index < size / 2) {
            Node<T> current = first;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.value;
        } else {
            Node<T> current = last;
            for (int i = size; i > index; i--) {
                current = current.preview;
            }
            return current.value;
        }

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
        node.preview = last;
        last = node;
        size++;
    }


    @Override
    public void addFirst(T obj) {
        Node<T> node = new Node<>(obj);
        if (first == null) {
            first = node;
            last = node;
            size++;
        }
        first.preview = node;
        node.next = first;
        first = node;
        size++;
    }


    @Override
    public int indexOf(T obj) {
        Node<T> current = first;
        for (int i = 0; i < size; i++) {

            if (current.value == null) {
                if (obj == null) {
                    return i;
                }
                current = current.next;
                i++;
            }

            if (current.value.equals(obj)) {
                return i;
            } else {
                current = current.next;
            }
        }
        return -1;
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        if (index == 0) {
            first = first.next;
            first.preview = null;
            size--;
            return;
        } else if (index == size - 1) {
            last = last.preview;
            last.next = null;
            size--;
            return;
        }
        if (index < size / 2) {
            Node<T> current = first;
            for (int i = 0; i <= index - 1; i++) {

                if (i == index - 1) {
                    current.next.next.preview = current.next.preview;
                    current.next = current.next.next;
                    size--;
                    return;
                }
                current = current.next;

            }


        }
    }

    @Override
    public boolean removeObj(T obj) {
        Node<T> current = first;
        int ind = indexOf(obj);
        if (ind == 0) {
            first = first.next;
            first.preview = null;
            size--;
            return true;
        } else if (ind == size - 1) {
            last = last.preview;
            last.next = null;
            size--;
            return true;
        }
        if (ind != -1) {
            for (int i = 0; i < ind - 1; i++) {
                current = current.next;

            }
            current.next.next.preview = current.next.preview;
            current.next = current.next.next;
            size--;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object obj) {
        Node<T> counter = first;
        for (int i = 0; i < size; i++) {
            if (counter.value.equals(obj)) {
                return true;
            }
            counter = counter.next;
        }
        return false;
    }

    public void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<T> current = first;
        for (int i = 0; i < size; i++) {
            result.append(current.value);
            if (i < size - 1) {
                result.append(",");
            }
            current = current.next;
        }
        result.append(']');
        return result.toString();
    }
}
