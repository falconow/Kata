package Task718;

@FunctionalInterface
public interface NumberGenerator<T extends Number> {
    boolean cond(T arg);
}
