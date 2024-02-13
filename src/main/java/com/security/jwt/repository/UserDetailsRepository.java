package com.security.jwt.repository;

import com.security.jwt.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface UserDetailsRepository extends MongoRepository<User, String> {
    @Query("{username:'?0'}")
    User findUserByUsername(String username);
}
