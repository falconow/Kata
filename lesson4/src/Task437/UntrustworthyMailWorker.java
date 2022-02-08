package Task437;

public class UntrustworthyMailWorker implements MailService {
    private RealMailService realMailService = new RealMailService();
    private MailService [] mailServices;

    public UntrustworthyMailWorker (MailService [] mails) {
        this.mailServices = mails;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        Sendable mail2 = mail;
        for (MailService i:mailServices) {
            mail2 = i.processMail(mail2);
        }
        return realMailService.processMail(mail);
    }

    public RealMailService getRealMailService() {
        return realMailService;
    }
}
