package com.paad.earthquake;

import android.location.Location;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by WangWei on 2014/12/15.
 */
public class Quake {

    private Date date;
    private String derails;
    private Location location;
    private double magnitude;
    private String link;

    public Date getDate(){
        return date;
    }

    public String getDerails(){
        return derails;
    }

    public Location getLocation(){
        return location;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getLink() {
        return link;
    }

    public Quake(Date date, String derails, Location location, double magnitude, String link) {
        this.date = date;
        this.derails = derails;
        this.location = location;
        this.magnitude = magnitude;
        this.link = link;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH.mm");
        String dateString = sdf.format(date);

        return  dateString +magnitude   + derails ;
    }
}

