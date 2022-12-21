package com.example.SushiByAvans.repo;

import com.example.SushiByAvans.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
