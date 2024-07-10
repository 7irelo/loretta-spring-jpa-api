package com.lorettabank;

import com.lorettabank.model.User;
import com.lorettabank.repository.UserRepository;
import com.lorettabank.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = LorettabankApplication.class)
@ComponentScan(basePackages = "com.lorettabank")
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Test
    void contextLoads() {
        // Test the context loading
    }

    @Test
    void testUserCreation() {
        User user = new User("testuser", "password");
        userService.save(user);
        User foundUser = userRepository.findByUsername("testuser");
        assert foundUser != null;
        assert foundUser.getUsername().equals("testuser");
    }
}
