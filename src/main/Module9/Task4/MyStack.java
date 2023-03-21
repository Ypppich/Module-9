package Task4;

import java.util.Stack;

public class MyStack<E> {
    private Object[] stack;
    private int pointer;
    private int capacity;

    MyStack (int size) {
        stack = new Object[size];
        capacity = size;
        pointer = 0;
    }
    public void push(E element) {
        if (pointer == capacity) {
            throw new IllegalStateException("Stack is full!");
        }
        stack[pointer++] = element;
    }
    public void remove(int index) {
        if (pointer == 0) {
            throw new IllegalStateException("Stack is empty!");
        } else if (index < 0 || index > pointer) {
            throw new IndexOutOfBoundsException("Out of range!");
        } else {
            for (int i = index; i < pointer; i++) {
                stack[i] = stack[i + 1];
            }
            stack[pointer] = null;
            pointer--;
        }
    }
    public void clear() {
        for (int i = 0; i < pointer; i++) {
            stack[i] = null;
        }
        pointer = 0;
    }
    public int size() {
        return pointer;
    }

    public E peek() {
        if (pointer == 0) {
            throw new IllegalStateException("Stack is empty!");
        } else {
            return (E) stack[0];
        }
    }
    public E pop() {
        if (pointer == 0) {
            throw new IllegalStateException("Stack is empty!");
        } else {
            E current = (E) stack[0];
            int index = 0;
            for (int i = index; i < pointer; i++) {
                stack[i] = stack[i + 1];
            }
            stack[pointer] = null;
            pointer--;
            return current;
        }
    }
}
