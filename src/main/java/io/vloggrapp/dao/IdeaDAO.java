package io.vloggrapp.dao;

import io.vloggrapp.model.Idea;

public interface IdeaDAO {

    public Idea getIdeaByID(Integer id);

    public boolean createIdea(Idea i);


}
