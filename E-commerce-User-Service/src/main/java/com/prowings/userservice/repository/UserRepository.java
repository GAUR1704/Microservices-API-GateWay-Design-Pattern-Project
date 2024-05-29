package com.prowings.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prowings.userservice.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}