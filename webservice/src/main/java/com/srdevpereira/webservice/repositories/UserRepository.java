package com.srdevpereira.webservice.repositories;

import com.srdevpereira.webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
