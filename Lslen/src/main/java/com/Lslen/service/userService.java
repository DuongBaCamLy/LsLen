package com.Lslen.service;

import com.Lslen.entity.user;

import java.util.List;

public interface userService {
    List<user> getAllUsers();
    user getUserById(Integer id);
    void insertUser(user u);
    void updateUser(user u);
    void deleteUser(Integer id);
}
