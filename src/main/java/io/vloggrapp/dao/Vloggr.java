package io.vloggrapp.dao;

import io.vloggrapp.security.LoginFactory;

public class Vloggr {

    private String firstName;
    private String lastName;

    public enum VloggerType{
        PHONE,EMAIL,ADMIN
    }

    private VloggerType type;
    private LoginFactory credentials;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public VloggerType getType() {
        return type;
    }

    public void setType(VloggerType type) {
        this.type = type;
    }

    public LoginFactory getCredentials() {
        return credentials;
    }

    public void setCredentials(LoginFactory credentials) {
        this.credentials = credentials;
    }
}
