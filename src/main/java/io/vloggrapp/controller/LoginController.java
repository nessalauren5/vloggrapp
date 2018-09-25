package io.vloggrapp.controller;

import io.vloggrapp.dao.Vloggr;
import io.vloggrapp.security.LoginFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/login")
@Produces("application/json")
public class LoginController {

    public static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @POST
    public Vloggr loginOrCreateUser(LoginFactory l){
        return new Vloggr();
    }
}
