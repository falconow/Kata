package Task437;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        MailMessage mailMessage = new MailMessage("Dima",Spy.AUSTIN_POWERS, "Hello");
        MailPackage pack1 = new MailPackage("Dima", "Vlad", new Package("fdkjkj fdhgkj stones",5000));
        MailPackage pack2 = new MailPackage("Dima", "Vlad", new Package("Деньги",1000));
        MailPackage pack3 = new MailPackage("Dima", "Vlad", new Package("Опилки",50));
        Spy spy = new Spy(Logger.getLogger(Main.class.getName()));
        Thief thief = new Thief(500);
        thief.processMail(pack1);
        thief.processMail(pack2);
        thief.processMail(pack3);
        spy.processMail(mailMessage);
        System.out.println(thief.getStolenValue());

        Inspector inspector = new Inspector();
        inspector.processMail(pack1);
        inspector.processMail(pack2);
        inspector.processMail(pack3);
    }
}
