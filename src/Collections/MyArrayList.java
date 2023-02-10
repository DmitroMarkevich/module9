package Collections;

import java.util.Arrays;

public class MyArrayList {
    private int sizeList = 0;
    private Object[] array = new Object[0];

    public Object get(int index) {
        return this.array[index];
    }

    public int size() {
        return this.sizeList;
    }

    public void add(Object value) {
        ++this.sizeList;
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
        this.array = new Object[0];
        this.sizeList = 0;
    }

    public String toString() {
        return Arrays.toString(this.array);
    }
}
