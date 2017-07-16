package com.duggirala.genie.service;

import com.duggirala.genie.model.Ride;
import com.duggirala.genie.repository.RideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.stereotype.Service;

/**
 * Created by raviteja on 7/15/17.
 */
@Service
public class RideServiceImpl implements RideService {
    private final RideRepository rideRepository;

    @Autowired
    public RideServiceImpl(RideRepository rideRepository) {
        this.rideRepository = rideRepository;
    }

    @Override
    public Ride createRidePost(Ride ride) {
        return rideRepository.save(ride);
    }

    @Override
    public Ride getRideByPostId(String postId) {
        return rideRepository.findByPostId(postId);
    }

    @Override
    public boolean isRideExists(String postId) {
        if(getRideByPostId(postId)==null) return false;
        return true;
    }
}
