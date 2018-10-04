package io.vloggrapp.resources;


import io.vloggrapp.model.Login;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Controller
@Produces("application/json")
@Path("/login")
public class LoginController {

     public static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @POST
    public String loginOrCreateUser(Login login){
        logger.debug(login.toString());
        return "User tried to login: " + login.getCrdntl();
    }

    @POST
    public String loginOrCreateUser(){
        return("received no object.");
    }
}
