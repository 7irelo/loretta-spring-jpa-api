package com.lorettabank.controller;

import com.lorettabank.mapper.Mapper;
import com.lorettabank.model.dto.UserDto;
import com.lorettabank.model.entity.User;
import com.lorettabank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private Mapper<User, UserDto> userMapper;

    @PutMapping("/{id}")
    public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDto) {
        User user = userMapper.mapFrom(userDto);
        User savedUser = userService.save(user);
        return new ResponseEntity<>(userMapper.mapTo(savedUser), HttpStatus.ACCEPTED);
    }
}
