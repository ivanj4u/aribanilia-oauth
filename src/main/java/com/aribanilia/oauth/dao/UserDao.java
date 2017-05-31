package com.aribanilia.oauth.dao;

import com.aribanilia.oauth.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by ivan_j4u on 5/31/2017.
 */
public interface UserDao extends MongoRepository<User, String> {

    User findByUserId(String userId);

    User findByUserIdAndPassword(String userId, String password);

}
