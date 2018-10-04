package io.vloggrapp.model;

import java.io.Serializable;

public class Login implements Serializable {

    private String crdntl;

    public Login(){
    }



    public String getCrdntl() {
        return crdntl;
    }

    public void setCrdntl(String crdntl) {
        this.crdntl = crdntl;
    }

    @Override
    public String toString(){
        return "Credentials Provided: " + crdntl;
    }
}
