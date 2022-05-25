package model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String mail;
    private String pass;
    private String name;
    private String identi;
    private List<Error> errors;

    public User(String mail, String pass, String identi) {
        this.mail = mail;
        this.pass = pass;
        this.identi = identi;
        errors = new ArrayList<Error>();
    }

public User(String mail, String pass, String identi,String name) {
        this.mail = mail;
        this.pass = pass;
        this.identi = identi;
        this.name=name;
        errors = new ArrayList<Error>();
    }

   

    public String getIdenti() {
        return identi;
    }

    public void setIdenti(String identi) {
        this.identi = identi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public void addError(Error error){
        errors.add(error);
    }
    
    public boolean errorExist(){
        return !errors.isEmpty();
    }

    public List<Error> getErrors() {
        return errors;
    }
    
    
}
