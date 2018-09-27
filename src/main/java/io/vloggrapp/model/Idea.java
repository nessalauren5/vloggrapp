package io.vloggrapp.model;

import java.util.ArrayList;

public class Idea {
    public Integer idea_id;

    public ArrayList<Integer> scenesByID;

    public String idea_name;

    public String idea_descr;

    public Idea(){}
    public Idea(String name){
        this.idea_name = name;
    }

    public Integer getIdea_id() {
        return idea_id;
    }

    public void setIdea_id(Integer idea_id) {
        this.idea_id = idea_id;
    }

    public ArrayList<Integer> getScenesByID() {
        return scenesByID;
    }

    public void setScenesByID(ArrayList<Integer> scenesByID) {
        this.scenesByID = scenesByID;
    }

    public String getIdea_name() {
        return idea_name;
    }

    public void setIdea_name(String idea_name) {
        this.idea_name = idea_name;
    }

    public String getIdea_descr() {
        return idea_descr;
    }

    public void setIdea_descr(String idea_descr) {
        this.idea_descr = idea_descr;
    }
}
