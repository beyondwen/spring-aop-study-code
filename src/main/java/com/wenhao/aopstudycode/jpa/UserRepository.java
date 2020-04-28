package com.wenhao.aopstudycode.jpa;


import com.wenhao.aopstudycode.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}