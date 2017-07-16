package com.duggirala.genie.service;

import com.duggirala.genie.model.Ride;

/**
 * Created by raviteja on 7/15/17.
 */
public interface RideService {
    Ride createRidePost(Ride ride);
    Ride getRideByPostId(String postId);
    boolean isRideExists(String postId);
}
