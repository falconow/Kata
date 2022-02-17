package Task718;

public class Main {

    public static void main(String[] args) {

    }

    public static NumberGenerator<? super Number> getGenerator() {
        return x -> x.intValue() > 0;
    }
}
