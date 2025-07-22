package com.datanet.homeassignment.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.datanet.homeassignment.model.User;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class UserController {

    private User currentUser;

    // POST - Getting name from client
    @PostMapping("/user")
    public void saveUser(@RequestBody User user) {
        currentUser = user;
    }

    // GET - Return currentUser to client
    @GetMapping("/user")
    public ResponseEntity<User> getUser() {
    if (currentUser == null || currentUser.getName().equals("")) {
        return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(currentUser);
    }
}
