package Collections;

import java.util.Arrays;

public class MyQueue {
    private int sizeList = 0;
    private Object[] array = new Object[0];
    public void add(Object value) {
        sizeList++;
        this.array = Arrays.copyOf(this.array, this.sizeList);
        this.array[this.sizeList - 1] = value;
    }

    public void clear() {
        this.array = new Object[0];
        sizeList = 0;
    }

    public int size() {
        return sizeList;
    }

    public Object peek() {
        return array[0];
    }

    public Object poll() {
        Object firstElem = array[0];
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
