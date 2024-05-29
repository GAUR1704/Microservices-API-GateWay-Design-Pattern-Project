package com.prowings.userservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.prowings.userservice.model.User;
import com.prowings.userservice.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }
    
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
