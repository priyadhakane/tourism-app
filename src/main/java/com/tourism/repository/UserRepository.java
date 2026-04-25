package com.tourism.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tourism.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByEmail(String email);
}