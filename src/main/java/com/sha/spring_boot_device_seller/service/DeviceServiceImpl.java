package com.sha.spring_boot_device_seller.service;


import com.sha.spring_boot_device_seller.model.Device;
import com.sha.spring_boot_device_seller.repository.DeviceRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class DeviceServiceImpl implements DeviceService{

    private final DeviceRepository deviceRepository;


    public DeviceServiceImpl(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }


    @Override
    public Device saveDevice(Device device)
    {
        device.setCreatTime(LocalDateTime.now());
        return deviceRepository.save(device);
    }

    @Override
    public void deleteDevice(Long id)
    {
        deviceRepository.deleteById(id);
    }

    @Override
    public List<Device> findAllDevices()
    {
        return deviceRepository.findAll();
    }
}
