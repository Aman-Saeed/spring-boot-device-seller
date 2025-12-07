package com.sha.spring_boot_device_seller.repository;

import com.sha.spring_boot_device_seller.model.Purchase;
import com.sha.spring_boot_device_seller.repository.projection.PurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

    @Query("SELECT d.name AS name, d.deviceType AS type, p.price AS price, p.color AS color, p.purchaseTime AS purchaseTime " +
            "FROM Purchase p LEFT JOIN p.device d " +
            "WHERE p.userId = :userId")
    List<PurchaseItem> findAllPurchaseOfUser(@Param("userId") Long userId);

}
