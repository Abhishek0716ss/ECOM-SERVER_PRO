
package com.bootA.ecom_server.repos;
import java.util.*;
import org.*;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.bootA.ecom_server.models.User;


public interface UserRepo extends MongoRepository <org.springframework.boot.autoconfigure.security.SecurityProperties.User, String>{
    Optional<org.springframework.boot.autoconfigure.security.SecurityProperties.User> findByEmail(String,email);
}