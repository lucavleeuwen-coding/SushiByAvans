package com.example.SushiByAvans.service;

import com.example.SushiByAvans.models.User;
import com.example.SushiByAvans.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {
    private UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo){
        this.userRepo = userRepo;
    }
public User addUser(User user){
      user.setUsercode(UUID.randomUUID().toString());
      return userRepo.save(user);
}
}
