package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/data")
    public ResponseEntity <List<String>> getData() {
        List<String> list = Arrays.asList(new String[]{"Text 1", "Text 2", "Text 3", "Text 4", "Text 5"});
        return ResponseEntity.ok().body(list);
    }
}

