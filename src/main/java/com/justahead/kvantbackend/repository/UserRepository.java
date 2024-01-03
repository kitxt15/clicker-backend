package com.justahead.kvantbackend.repository;

import com.justahead.kvantbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);

    boolean existsByUsername(String username);

    boolean deleteByUsername(String username);
}
