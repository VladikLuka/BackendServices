package com.epam.backendservices.repository;

import com.epam.backendservices.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
