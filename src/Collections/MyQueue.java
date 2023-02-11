package Collections;

import java.util.Arrays;

public class MyQueue<E> {
    private int sizeList = 0;
    private E[] array = (E[]) new Object[sizeList];
    public void add(E value) {
        sizeList++;
        this.array = Arrays.copyOf(this.array, this.sizeList);
        this.array[this.sizeList - 1] = value;
    }

    public void clear() {
        this.array = (E[]) new Object[0];
        this.sizeList = 0;
    }

    public int size() {
        return sizeList;
    }

    public E peek() {
        return array[0];
    }

    public E poll() {
        E firstElem = array[0];
        this.sizeList--;

        for(int i = 0; i < this.sizeList; ++i) {
            this.array[i] = this.array[i + 1];
        }
        this.array = Arrays.copyOf(this.array, this.sizeList);
        return firstElem;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
