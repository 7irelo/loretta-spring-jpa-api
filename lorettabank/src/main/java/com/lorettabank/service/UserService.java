package com.lorettabank.service;

import com.lorettabank.model.User;
import com.lorettabank.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User save(User user) {
        // Encode the user's password before saving
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public User findByUsername(String username) {
        // Retrieve a user by their username
        return userRepository.findByUsername(username);
    }

    // Optional: Exception handling example
    public User findUserByUsername(String username) {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new IllegalArgumentException("User not found with username: " + username);
        }
        return user;
    }
}
