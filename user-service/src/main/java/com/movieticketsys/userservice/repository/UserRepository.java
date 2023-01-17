package com.movieticketsys.userservice.repository;

import com.movieticketsys.userservice.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {


}
