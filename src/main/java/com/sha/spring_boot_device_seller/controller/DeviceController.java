package com.sha.spring_boot_device_seller.controller;


import com.sha.spring_boot_device_seller.model.Device;
import com.sha.spring_boot_device_seller.service.DeviceService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("api/deivces")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;
    private static final Logger log = LoggerFactory.getLogger(DeviceController.class);


    @PostMapping //api/device
    public ResponseEntity<?> saveDevice(@RequestBody Device device){
        return new ResponseEntity<>(deviceService.saveDevice(device), HttpStatus.CREATED);
    }

    @DeleteMapping("{deviceId}") //api/device/{deviceId}
    public ResponseEntity<?> deleteDevice(@PathVariable Long deviceId)
    {
        deviceService.deleteDevice(deviceId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping //api/device
    public ResponseEntity<?> getAllDevice()

    {
        log.info("called");
        log.info("called"); log.info("called");
        log.info("called");
        log.info("called");
        log.info("called");
        log.info("called");
        log.info("called");
        log.info("called");
        log.info("called");
        log.info("called");

        return new ResponseEntity<>(deviceService.findAllDevices(), HttpStatus.OK);
    }

}
