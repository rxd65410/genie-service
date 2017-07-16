package com.duggirala.genie.repository;

import com.duggirala.genie.model.UserAuth;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by raviteja on 7/16/17.
 */
public interface UserRepository extends CrudRepository<UserAuth,String> {
    UserAuth findOneByName(String name);
}
