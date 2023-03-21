package Task2;

public class MyLinkedList <T> {
    private Node first;
    private Node last;
    private int size;

    private class Node {
        T value;
        Node next;
        Node prev;

        public Node(T value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    public void add(T value) {
        Node newNode = new Node(value);
        if (last == null) {
            first = last = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
        }
        size++;
    }
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Out of range: " + index);
        }
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        if(current == first) {
            first = current.next;
            if (first != null) {
                first.prev = null;
            }
        } else if (current == last ) {
            last = current.prev;
            if (last != null) {
                last.next = null;
            }
        }else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
        size--;
        return current.value;
    }
    public void clear() {
        first = last = null;
        size = 0;
    }
    public int size() {
        return size;
    }
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Out of range: " + index);
        }
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }
}
