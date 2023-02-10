package Collections;

import java.util.Arrays;

public class MyStack {
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
        return array[sizeList - 1];
    }

    public Object pop() {
        Object lastElem = array[sizeList-1];
        this.sizeList--;

        for(int i = sizeList; i < this.sizeList; ++i) {
            this.array[i] = this.array[i + 1];
        }
        this.array = Arrays.copyOf(this.array, this.sizeList);
        return lastElem;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
