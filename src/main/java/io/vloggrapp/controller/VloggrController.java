package io.vloggrapp.controller;

import io.vloggrapp.dao.Vloggr;
import io.vloggrapp.model.VloggrDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/vloggr")
@Produces("application/json")
public class VloggrController {

    public static final Logger logger = LoggerFactory.getLogger(VloggrController.class);
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
