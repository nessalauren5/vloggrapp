package io.vloggrapp.dao;

import io.vloggrapp.model.Idea;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


public interface IdeaDAO {

    public Idea getIdeaByID(Integer id);

    public boolean createIdea(Idea i);


}
