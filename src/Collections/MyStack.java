package Collections;

import java.util.Arrays;

public class MyStack<E> {
    private int sizeList = 0;
    private E[] array = (E[]) new Object[sizeList];
    public void push(E value) {
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
        return array[sizeList - 1];
    }

    public E pop() {
        E lastElem = array[sizeList - 1];
        this.sizeList--;

        for(int i = sizeList; i < this.sizeList; ++i) {
            this.array[i] = this.array[i + 1];
        }
        this.array = Arrays.copyOf(this.array, this.sizeList);
        return lastElem;
    }
    public void remove(int index) {
        --this.sizeList;

        for(int i = index; i < this.sizeList; ++i) {
            this.array[i] = this.array[i + 1];
        }

        this.array = Arrays.copyOf(this.array, this.sizeList);
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
