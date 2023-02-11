package Collections;

import java.util.Arrays;

public class MyArrayList<E> {
    private int sizeList = 0;
    private E[] array = (E[]) new Object[sizeList];

    public E get(int index) {
        return this.array[index];
    }

    public int size() {
        return sizeList;
    }

    public void add(E value) {
        sizeList++;
        this.array = Arrays.copyOf(this.array, this.sizeList);
        this.array[this.sizeList - 1] = value;
    }

    public void remove(int index) {
        --this.sizeList;

        for(int i = index; i < this.sizeList; ++i) {
            this.array[i] = this.array[i + 1];
        }

        this.array = Arrays.copyOf(this.array, this.sizeList);
    }

    public void clear() {
        this.array = (E[]) new Object[0];
        this.sizeList = 0;
    }

    public String toString() {
        return Arrays.toString(this.array);
    }
}
