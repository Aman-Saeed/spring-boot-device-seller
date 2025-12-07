package com.sha.spring_boot_device_seller.repository;

import com.sha.spring_boot_device_seller.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

/*
    Author: Aman Saeed
    Date: 03.12.2025

 */


public interface DeviceRepository extends JpaRepository<Device, Long> {
}
