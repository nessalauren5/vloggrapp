package io.vloggrapp.security;

public abstract class LoginFactory {
    public enum LoginType {
        PHONE,EMAIL
    };

    private static LoginFactory getFactory(LoginType loginType) {

        LoginFactory l = null;

        switch (loginType) {
            case EMAIL:
                l = new EmailCredentials();
            break;
            case PHONE:
                l =  new PhoneCredentials();
            break;
            default:
                break;
        }

        return l;
    }

}
