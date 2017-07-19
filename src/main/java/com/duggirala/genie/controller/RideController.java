package com.duggirala.genie.controller;

import com.duggirala.genie.model.Ride;
import com.duggirala.genie.service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by raviteja on 7/15/17.
 */
@RestController
@RequestMapping("/ride")
public class RideController {
    private final RideService rideService;

    @Autowired
    public RideController(RideService rideService) {
        this.rideService = rideService;
    }


    @RequestMapping(value = "/", method = POST,
            consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Ride> createRide(@Valid @RequestBody Ride ride) {
        if(rideService.isRideExists(ride.getPostId())) return new ResponseEntity<>(HttpStatus.CONFLICT);
        Ride createdRide = rideService.createRidePost(ride);
        return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(createdRide);
    }

    @RequestMapping(value = "/{postId}",method = GET, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Ride> getRideByPostId(@PathVariable String postId){
        Ride ride = rideService.getRideByPostId(postId);
        if(ride==null){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(ride);
        }
        return ResponseEntity.ok(ride);
    }
}
