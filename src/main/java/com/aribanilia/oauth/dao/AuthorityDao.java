package com.aribanilia.oauth.dao;

import com.aribanilia.oauth.entity.Authority;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by ivan_j4u on 5/31/2017.
 */
public interface AuthorityDao extends MongoRepository<Authority, String> {

    Authority findByAuthorityId(String authorityId);

}
