package Task7213;

import org.omg.PortableInterceptor.ServerRequestInfo;

public class MailMessage extends AbstractMail<String> {

    public MailMessage (String From, String To, String Content) {
        super(From, To, Content);
    }

}
