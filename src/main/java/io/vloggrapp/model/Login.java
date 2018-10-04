package io.vloggrapp.model;

public class Login {

    public String crdntl;

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
