package com.neosoft.main.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.main.Model.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {

}
