package fwa;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
//import com.rsaraiva.labs.vraptor4.model.Event;
//import com.rsaraiva.labs.vraptor4.service.EventService;
import java.io.Serializable;
import javax.inject.Inject;


@Controller
public class MailController implements Serializable {

    @Inject
    private MailService service;


    @Get
    public void add(MyMail mymail) {
        System.out.println("lala");
        System.out.println("add");
        System.out.println(mymail.getUsername()+ "" + mymail.getPassword() + "" + mymail.getMailTo() + "" + mymail.getMessage());
       service.sendMail(mymail);
   }
}