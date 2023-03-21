package Task3;



public class MyQueue <T> {
    private Object[] queue;
    private int head;
    private int queueSize;
    private final int capacity;

    public MyQueue(int size) {
        queue = new Object[size];
        head = 0;
        queueSize = 0;
        capacity = size;
    }

    public void add(T value) {
        if (queueSize >= capacity) {
            throw new IllegalStateException("Queue is full!");
        } else {
            queue[queueSize] = value;
            queueSize++;
        }
    }

    public void clear() {
        for (int i = 0; i < queueSize; i++) {
            queue[i] = null;
        }
        queueSize = 0;
    }

    public int size() {
        return queueSize;
    }

    public T peek() {
        return (T) queue[head];
    }

    public T poll() {
        if (queueSize < 1) {
            throw new IndexOutOfBoundsException("Queue is empty!");
        } else {
            T current = (T) queue[head];
            if (queueSize > 1) {
                for (int i = 0; i < queueSize-1; i++) {
                    queue[i] = queue[i + 1];
                }
            } else {
                queue[head] = null;
            }
            queueSize--;
            return current;
        }
    }
}
