package com.careerdevs.UserRestAPI.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping("/users")
    public String getUsers() {
        return "HTTP Get request was sent";
    }

    @PostMapping("/")
    public String newUsers() {
        return "HTTP Post request was sent";
    }

    @PutMapping("/")
    public String userID() {
        return "HTTP Put request was sent";
    }

    @DeleteMapping ("/")
    public String deleteUserID() {
        return "HTTP Delete request was sent";
    }


}