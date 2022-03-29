package com.example.hospitalcleaner.authjwt.security.services;

import com.example.hospitalcleaner.authjwt.payload.request.LoginRequest;
import com.example.hospitalcleaner.authjwt.payload.request.SignupRequest;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    ResponseEntity authenticateUser(LoginRequest loginRequest);
    ResponseEntity registerUser(SignupRequest signupRequest);
    ResponseEntity logoutUser();

}
