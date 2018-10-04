package io.vloggrapp.resources;


import io.vloggrapp.model.Login;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Controller
@Path("/login")
public class LoginController {

     public static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @POST
    @Path("create")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Login loginOrCreateUser(Login login){
        logger.debug(login.toString());
        return login;
        //return "User tried to login: " + login.getCrdntl();
    }

    @POST
    public String loginOrCreateUser(){
        logger.debug("received no object.");
        return("received no object.");
    }
}
