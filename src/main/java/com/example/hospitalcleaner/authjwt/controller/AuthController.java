package com.example.hospitalcleaner.authjwt.controller;

import com.example.hospitalcleaner.authjwt.models.ERole;
import com.example.hospitalcleaner.authjwt.models.Role;
import com.example.hospitalcleaner.authjwt.models.User;
import com.example.hospitalcleaner.authjwt.payload.request.LoginRequest;
import com.example.hospitalcleaner.authjwt.payload.request.SignupRequest;
import com.example.hospitalcleaner.authjwt.payload.response.MessageResponse;
import com.example.hospitalcleaner.authjwt.payload.response.UserInfoResponse;
import com.example.hospitalcleaner.authjwt.repository.RoleRepository;
import com.example.hospitalcleaner.authjwt.repository.UserRepository;
import com.example.hospitalcleaner.authjwt.security.jwt.JwtUtils;
import com.example.hospitalcleaner.authjwt.security.services.AuthService;
import com.example.hospitalcleaner.authjwt.security.services.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    AuthService authService;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    JwtUtils jwtUtils;

    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
        return authService.authenticateUser(loginRequest);
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
        return authService.registerUser(signUpRequest);
    }

    @PostMapping("/signout")
    public ResponseEntity<?> logoutUser() {

        return authService.logoutUser();
    }
}
