package com.shri.framework.spring.db.data.stax.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.shri.framework.spring.db.data.stax.into.User;

@Repository
public interface UserRepository extends CassandraRepository<User, Integer> {

}
