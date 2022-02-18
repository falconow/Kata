package Task7210;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        pseudoRandomStream(13).limit(10).forEach(i -> System.out.println(i));

    }

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> n * n / 10 % 1000);
    }

}
