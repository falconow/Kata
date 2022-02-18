package Task7213;

public interface Sendable<T> {
    public String getFrom();
    public String getTo();
    public T getContent();
}
