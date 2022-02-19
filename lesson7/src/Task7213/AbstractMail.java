package Task7213;

public abstract class AbstractMail<T> implements Sendable<T> {
    private String from;
    private String to;
    private T content;

    public AbstractMail (String From, String To, T Content) {
        this.from = From;
        this.to = To;
        this.content = Content;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public T getContent() {
        return content;
    }
}
