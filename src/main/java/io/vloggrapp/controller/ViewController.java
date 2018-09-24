package io.vloggrapp.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class ViewController {

    @GET
    public String homePage() {
        return "index";
    }

    @Path("/test")
    @GET
    public String test(){
        return "index";
    }
}
