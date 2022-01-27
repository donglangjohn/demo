package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/test2")
public class ApiController2 {

    @GetMapping(name = "get2",value = "get2",produces = {MediaType.APPLICATION_JSON_VALUE})
    @ApiOperation("get test without parameters")
    public ResponseEntity<User> get(){
        User u = new User();
        u.setName("abctest");
        return new ResponseEntity<>(u, HttpStatus.BAD_REQUEST);
    }
    
}
