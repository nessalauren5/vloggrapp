package io.vloggrapp.model;

import java.util.ArrayList;
import java.util.Date;

public class Scene {

    public Integer scene_id;

    public String scene_name;

    public String scene_descr;


    //called inspiration
    public ArrayList<String> similarVids;

    public String equipment;

    public String purpose;

    public Integer length;

    public enum LengthType{
        SECS,MINS,HOURS
    };

    public LengthType lengthType;

    public Date shoot_date;

    public byte[] scene_image;


}
