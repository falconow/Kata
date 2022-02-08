package Task437;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Spy implements MailService {
    private Logger logger;
    public static final String AUSTIN_POWERS = "Austin Powers";

    public Spy(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage) {
           if (mail.getFrom().equalsIgnoreCase(AUSTIN_POWERS) || mail.getTo().equalsIgnoreCase(AUSTIN_POWERS)) {
               logger.log(Level.WARNING, "Detected target mail correspondence: from {0} to {1} \"{2}\"", new Object[] {mail.getFrom(), mail.getTo(), ((MailMessage) mail).getMessage()});
           } else {
               logger.log(Level.INFO, "Usual correspondence: from {0} to {1}", new Object[] {mail.getFrom(), mail.getTo()} );
           }
        }
        return mail;
    }
}
