package com.sarademo.apilamatraca.controller;

import com.sarademo.apilamatraca.dtos.LoginUserDto;
import com.sarademo.apilamatraca.dtos.UserDto;
import com.sarademo.apilamatraca.entities.User;
import com.sarademo.apilamatraca.exception.UsernameAlreadyExistsException;
import com.sarademo.apilamatraca.security.jwt.TokenProvider;
import com.sarademo.apilamatraca.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenProvider jwtTokenProvider;

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<String> generateToken(@RequestBody LoginUserDto loginUser) throws AuthenticationException {

        final Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginUser.getUsername(),
                        loginUser.getPassword()
                )
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        final String token = jwtTokenProvider.generateToken(authentication);
        return ResponseEntity.status(HttpStatus.OK).body(token);
    }

    @PostMapping("/register")
    public ResponseEntity<Long> saveUser(@RequestBody UserDto user) throws UsernameAlreadyExistsException {
        return ResponseEntity.status(HttpStatus.OK).body(userService.save(user));
    }
}
