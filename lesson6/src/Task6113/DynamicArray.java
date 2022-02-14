package Task6113;

import java.util.ArrayList;
import java.util.Arrays;


public class DynamicArray<T> {
    private Object[] e1 = new Object[]{};

    public T get(int index) {
        return (T) e1[index];
    }

    public void add(T el) {
        e1 = Arrays.copyOf(e1,e1.length+1);
        e1[e1.length-1] = el;
    }

    public void remove(int index) {
        System.arraycopy();
    }

    @Override
    public String toString() {
        return Arrays.toString(e1);
    }
}
