package com.duggirala.genie.repository;

import com.duggirala.genie.model.Ride;
import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by raviteja on 7/15/17.
 */
public interface RideRepository extends CrudRepository<Ride,ObjectId>{
    Ride findByPostId(String postId);
}
