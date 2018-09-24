package io.vloggrapp.controller;

import io.vloggrapp.dao.Vloggr;
import io.vloggrapp.security.LoginFactory;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/login")
@Produces("application/json")
public class LoginController {

    @POST
    public Vloggr loginOrCreateUser(LoginFactory l){
        return new Vloggr();
    }
}
