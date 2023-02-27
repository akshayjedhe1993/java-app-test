package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.Search;
import com.example.demo.modal.User;
import com.example.demo.services.UserService;

@RestController
public class Controller {
    @Autowired UserService userService;

    @GetMapping("/data")
    public ResponseEntity <List<String>> getData() {
        List<String> list = userService.getData();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping("/users")
    public ResponseEntity <List<User>> getUsers(@RequestBody Search searchObj) {
        List<User> list = userService.getUsers(searchObj);
        return ResponseEntity.ok().body(list);
    }
}

