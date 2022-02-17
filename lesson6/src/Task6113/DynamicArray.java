package Task6113;


import java.util.Arrays;

public class DynamicArray<T> {
    private T[] values = (T[]) new Object[10];
    private int valuesIndex = 0;

    public DynamicArray(){}

    public T get(int index) {
        if (index >= 0 && index < valuesIndex) {
            return (T) values[index];
        } else {
            throw new ArrayIndexOutOfBoundsException("Bad index " + index + "!");
        }
    }

    public void add(T el) {
        if (valuesIndex == values.length - 1) {
            values = Arrays.copyOf(values, values.length*2);
        }
        values[valuesIndex] = el;
        valuesIndex++;
    }

    public void remove(int index) {
        System.arraycopy(values, index + 1, values, index, values.length - index - 1);
        valuesIndex--;
    }

    @Override
    public String toString() {
        return Arrays.toString(values);
    }
}
