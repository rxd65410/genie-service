package com.duggirala.genie.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by raviteja on 7/15/17.
 */

@Document(collection = "rides")
public class Ride extends Post{
    private Place fromPlace;
    private Place toPlace;
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
}
