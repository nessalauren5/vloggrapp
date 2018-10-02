package io.vloggrapp.dao.impl;

import io.vloggrapp.dao.IdeaDAO;
import io.vloggrapp.model.Idea;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public class IdeaDAOImpl implements IdeaDAO {

    @Override
    public Idea getIdeaByID(Integer id) {
        return null;
    }

    @Override
    public boolean createIdea(Idea i) {
        return false;
    }
}
