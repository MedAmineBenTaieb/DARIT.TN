package tn.dari.spring.service.interfaces;

import tn.dari.spring.domain.Email;
import org.springframework.stereotype.Component;



import javax.mail.MessagingException;
import java.io.IOException;

@Component
public interface EmailService {

    Boolean sendSimpleMessage(Email email);
    Boolean sendMessageWithCC(Email email);
    Boolean sendMessageWithAttachment(Email email) throws IOException, MessagingException;

}
