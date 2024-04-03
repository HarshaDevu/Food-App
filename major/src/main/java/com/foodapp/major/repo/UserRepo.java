package com.foodapp.major.repo;

import com.foodapp.major.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
    public User findUserByEmail(String email);

}
