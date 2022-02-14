package Task6112;

import java.util.Objects;
import java.util.Optional;

public class Pair<I,S> {
    private final I object1;
    private final S object2;

    private Pair(I value1, S value2){
        this.object1 = value1;
        this.object2 = value2;
    }

    public I getFirst() {
        return object1;
    }

    public S getSecond() {
        return object2;
    }

    public static<I,S> Pair<I,S> of(I value1, S value2) {
        return new Pair<>(value1, value2);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Pair)) {
            return false;
        }

        Pair<?, ?> other = (Pair<?, ?>) obj;
        return Objects.equals(object1, other.object1) && Objects.equals(object2, other.object2);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(object1) + Objects.hashCode(object2);
    }

}
