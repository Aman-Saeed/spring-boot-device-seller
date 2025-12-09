package com.sha.spring_boot_device_seller.security.jwt;

import com.sha.spring_boot_device_seller.security.UserPrincipal;
import jakarta.servlet.http.HttpServletRequest;

public interface JwtProvider {
    String generateToken(UserPrincipal auth);

    boolean isTokenValid(HttpServletRequest request);
}
