package com.lorettabank.service;

import com.lorettabank.model.User;
import com.lorettabank.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public User save(User user) {
        // Encode the user's password before saving
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public User findByUsername(String username) {
        // Retrieve a user by their username
        return userRepository.findByUsername(username);
    }
}
