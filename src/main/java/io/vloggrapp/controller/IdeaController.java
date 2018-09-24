package io.vloggrapp.controller;

import io.vloggrapp.dao.IdeaDAO;
import io.vloggrapp.model.Idea;

import javax.inject.Inject;
import javax.ws.rs.*;

@Path("/ideas")
@Produces("application/json")
public class IdeaController {

    private final IdeaDAO ideaDAO;

    @Inject
    public IdeaController(IdeaDAO ideaDAO) {
        this.ideaDAO = ideaDAO;
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
