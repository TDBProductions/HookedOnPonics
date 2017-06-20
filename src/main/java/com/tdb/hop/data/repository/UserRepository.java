package com.tdb.hop.data.repository;

import org.springframework.data.repository.CrudRepository;
import com.tdb.hop.data.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long>
{

}
