package Task7211;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

    }

    public <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> values = stream.collect(Collectors.toList());
        if (!values.isEmpty()) {
            minMaxConsumer.accept(values.stream().min(order).get(), values.stream().max(order).get());
        } else {
            minMaxConsumer.accept(null, null);
        }
    }


}
