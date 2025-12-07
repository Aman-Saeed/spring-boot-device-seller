package com.sha.spring_boot_device_seller.repository;

import com.sha.spring_boot_device_seller.model.Role;
import com.sha.spring_boot_device_seller.model.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
/*
    Author: Aman Saeed
    Date: 03.12.2025

 */

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);


    @Transactional
    @Modifying
    @Query("update User u set u.role = :role where u.username = :username")
    void updateUserRole(@Param("username") String username, @Param("role")Role role);
}
