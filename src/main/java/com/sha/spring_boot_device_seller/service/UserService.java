package com.sha.spring_boot_device_seller.service;

import com.sha.spring_boot_device_seller.model.User;

import java.util.Optional;

public interface UserService {
    User saveUser(User user);

    Optional<User> findByUserName(String username);
}
