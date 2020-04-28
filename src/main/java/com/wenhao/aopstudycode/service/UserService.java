package com.wenhao.aopstudycode.service;

import com.wenhao.aopstudycode.domain.User;
import com.wenhao.aopstudycode.jpa.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //@Autowired
    //private TranscationUtil transcationUtil;

    //@Transactional
    public void add(int i) {
        User user = new User();
        user.setPassword(UUID.randomUUID().toString());
        user.setUsername(UUID.randomUUID().toString());
        userRepository.save(user);
        int x = 1 / i;
    }
}
