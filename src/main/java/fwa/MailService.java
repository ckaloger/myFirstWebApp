package fwa;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import javax.ejb.Stateless;
//import javax.persistence.PersistenceContext;

@Stateless
public class MailService {


    public void sendMail(MyMail mymail) {
        Email email = new SimpleEmail();
        try {
            System.out.println("sendMail");
            System.out.println(mymail.getUsername()+ "" + mymail.getPassword() + "" + mymail.getMailTo() + "" + mymail.getMessage());
            email.setHostName("smtp.office365.com");
            email.setSmtpPort(587);
            email.setAuthentication(mymail.getUsername(),mymail.getPassword());
            //email.setSSLOnConnect(true);
            email.setTLS(true);
            email.setFrom("k.kalogerakis@netmechanics.gr");
            email.setSubject("TestMail");
            email.setMsg(mymail.getMessage());
            email.addTo(mymail.getMailTo());
            email.send();
            System.out.println("lala");
        } catch (EmailException ee) {
            ee.printStackTrace();
        }
    }
}