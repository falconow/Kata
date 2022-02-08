package Task437;

import sun.java2d.pipe.SpanClipRenderer;

public class Thief implements MailService {
    private final int price;
    private int sum = 0;

    public Thief(int price) {
        this.price = price;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            Package pack = ((MailPackage) mail).getContent();
            if (pack.getPrice() >= price) {
                sum+=pack.getPrice();
                return new MailPackage(mail.getFrom(), mail.getTo(), new Package("stones instead of " + pack.getContent(),0));
            }
        }
        return mail;
    }

    public int getStolenValue() {
        return sum;
    }
}
