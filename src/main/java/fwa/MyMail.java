package fwa;

import java.io.Serializable;

public class MyMail implements Serializable {


    private String  username;

    private String password ;

    private String mailTo ;

    private String message;

    public MyMail() { }

    public MyMail(String username, String password, String mailTo, String message) {
        this.username = username;
        this.password = password;
        this.mailTo = mailTo;
        this.message = message;
    }

    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public String getMailTo(){
        return this.mailTo;
    }
    public String getMessage(){
        return this.message;
    }
}