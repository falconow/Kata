package Task7213;

public class AbstractMail<T> implements Sendable<T> {
    private String From;
    private String To;
    private T Content;

    public AbstractMail (String From, String To, T Content) {
        this.From = From;
        this.To = To;
        this.Content = Content;
    }

    @Override
    public String getFrom() {
        return From;
    }

    @Override
    public String getTo() {
        return To;
    }

    @Override
    public T getContent() {
        return Content;
    }
}
