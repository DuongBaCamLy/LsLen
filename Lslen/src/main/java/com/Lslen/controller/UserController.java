package com.Lslen.controller;

import com.Lslen.entity.user;
import com.Lslen.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private userService userService;

    @GetMapping
    public List<user> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public user getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @PostMapping
    public void insertUser(@RequestBody user u) {
        userService.insertUser(u);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable Integer id, @RequestBody user u) {
        u.setId(id);
        userService.updateUser(u);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);
    }
}
