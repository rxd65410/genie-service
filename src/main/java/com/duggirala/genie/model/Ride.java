package com.duggirala.genie.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by raviteja on 7/15/17.
 */

@Document(collection = "rides")
public class Ride extends Post{
    private Place fromPlace;
    private Place toPlace;
    private Map<String, Object> location = new HashMap<>();
    private long journeyDate;

    public Place getFromPlace() {
        return fromPlace;
    }

    public void setFromPlace(Place fromPlace) {
        this.fromPlace = fromPlace;
    }

    public Place getToPlace() {
        return toPlace;
    }

    public void setToPlace(Place toPlace) {
        this.toPlace = toPlace;
    }

    public long getJourneyDate() {
        return journeyDate;
    }

    public void setJourneyDate(long journeyDate) {
        this.journeyDate = journeyDate;
    }

    public Map<String, Object> getLocation() {
        return location;
    }

    public void setLocation(Map<String, Object> location) {
        this.location = location;
    }
}
