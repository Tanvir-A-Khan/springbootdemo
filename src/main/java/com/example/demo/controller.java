package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class controller {
    @GetMapping("/get-user")
    public ResponseEntity<String> getUsers(){
        return new ResponseEntity<>("Hello world", HttpStatus.OK);
    }
}
