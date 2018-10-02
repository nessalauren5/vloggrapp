package io.vloggrapp.resources;

import io.vloggrapp.dao.IdeaDAO;
import io.vloggrapp.model.Idea;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.inject.Inject;
import javax.ws.rs.*;

@Controller
@Produces("application/json")
@Path("/ideas")
public class IdeaController {

    public static final Logger logger = LoggerFactory.getLogger(IdeaController.class);

    @Autowired
    private IdeaDAO ideaDAO;


    @GET
    public Idea getIdea() {
        logger.debug("Get Idea! ");
        return new Idea("Testing 123!");
    }

    @Path("/{idea_id}")
    @GET
    public Idea getIdea(@PathParam("idea_id") Integer id) throws NotFoundException{
        Idea i = ideaDAO.getIdeaByID(id);
        if(i==null){
            throw new NotFoundException();
        }
        return i;
    }
}
