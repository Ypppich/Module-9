package Task1;

public class MyArrayList<E> {
    private final int SIZE = 10;
    private int currentPointer = 0;
    private final int CUT_RATE = 2;
    private Object[] array = new Object[SIZE];
    private void resize(int newSize) {
        E[] newArray = (E[]) new Object[newSize];
        System.arraycopy(array, 0, newArray, 0, currentPointer);
        array = newArray;
    }
    public void add(E item) {
        if(currentPointer == array.length - 1) {
            resize(array.length * 2);
        }
        array[currentPointer++] = item;
    }
    public void remove(int index) {
        for(int i = index; i < currentPointer; i++) {
            array[i] = array[i+1];
        }
        array[currentPointer] = null;
        currentPointer--;
        if (array.length > SIZE && currentPointer < array.length / CUT_RATE) {
            resize(array.length / 2);
        }
    }

    public void clear() {
        for (int i = 0; i <= currentPointer; i++) {
            array[i] = null;
        }
        currentPointer = 0;
    }

    public int size() {
        return currentPointer;
    }
    public E get(int index) {
        return (E) array[index];
    }

}
