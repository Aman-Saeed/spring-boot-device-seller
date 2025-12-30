package com.sha.spring_boot_device_seller.controller;


import com.sha.spring_boot_device_seller.model.Purchase;
import com.sha.spring_boot_device_seller.security.UserPrincipal;
import com.sha.spring_boot_device_seller.service.PurchaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/purchase")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;
    private static final Logger log = LoggerFactory.getLogger(PurchaseController.class);



    @PostMapping
    public ResponseEntity<?> savePurchase(@RequestBody Purchase purchase)
    {

        log.info("purchasssssssssssssssssssseeeeeeeeee ====== " +purchase);
       return new ResponseEntity<>(purchaseService.savePurchase(purchase), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getAllPurchasesOfUser(@AuthenticationPrincipal UserPrincipal userPrincipal)
    {
        return ResponseEntity.ok(purchaseService.findPurchaseItemOfUser(userPrincipal.getId()));
    }

}
