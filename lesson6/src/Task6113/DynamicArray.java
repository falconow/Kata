package Task6113;

import java.util.ArrayList;
import java.util.Arrays;


public class DynamicArray<T> {
    private Object[] e1 = new Object[]{};

    public T get(int index) {
        return (T) e1[index];
    }

    public void add(T el) {
        e1 = Arrays.copyOf(e1, e1.length + 1);
        e1[e1.length - 1] = el;
    }

    public void remove(int index) {
        Object[] test = new Object[e1.length - 1];
        System.arraycopy(e1, 0, test, 0, index);
        System.arraycopy(e1, index + 1, test, index, test.length - index);
        e1 = test;
    }

    @Override
    public String toString() {
        return Arrays.toString(e1);
    }
}
