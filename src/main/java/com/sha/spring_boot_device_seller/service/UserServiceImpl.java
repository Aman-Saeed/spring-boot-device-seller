package com.sha.spring_boot_device_seller.service;


import com.sha.spring_boot_device_seller.model.Role;
import com.sha.spring_boot_device_seller.model.User;
import com.sha.spring_boot_device_seller.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User saveUser(User user){

        user.setPassword(passwordEncoder.encode((user.getPassword())));
        user.setRole(Role.USER);
        user.setCreateTime(LocalDateTime.now());

        return userRepository.save(user);
    }

    @Override
    public Optional<User> findByUserName(String username)
    {
        return userRepository.findByUsername(username);
    }
}
