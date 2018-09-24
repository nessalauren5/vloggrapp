package io.vloggrapp.controller;

import io.vloggrapp.dao.Vloggr;
import io.vloggrapp.model.VloggrDAO;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/vloggr")
@Produces("application/json")
public class VloggrController {

    private final VloggrDAO vloggrDAO;


    @Inject
    public VloggrController(VloggrDAO vl){
        this.vloggrDAO = vl;
    }

    @Path("/create")
    @POST
    public Vloggr createVloggr(VloggrDAO user){

        return new Vloggr();
    }

}
