package com.geo.dao;

import com.geo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUserName(String username);
    boolean existsByUserName(String username);
    boolean existsByEmail(String email);


}