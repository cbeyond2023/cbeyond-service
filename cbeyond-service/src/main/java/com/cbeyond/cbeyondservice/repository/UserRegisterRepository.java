package com.cbeyond.cbeyondservice.repository;

import com.cbeyond.cbeyondservice.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRegisterRepository extends MongoRepository<User,Integer> {
}
