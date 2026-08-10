package com.example.secondhand_electronics.repository;

import com.example.secondhand_electronics.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}