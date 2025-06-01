package com.Lslen.service.impl;

import com.Lslen.entity.user;
import com.Lslen.repository.userRepository;
import com.Lslen.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImpl implements userService {

    @Autowired
    private userRepository userRepository;

    @Override
    public List<user> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public user getUserById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void insertUser(user u) {
        userRepository.save(u);
    }

    @Override
    public void updateUser(user u) {
        userRepository.save(u);
    }

    @Override
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
