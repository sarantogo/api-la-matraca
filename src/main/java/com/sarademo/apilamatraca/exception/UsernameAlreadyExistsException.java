package com.sarademo.apilamatraca.exception;

import com.sarademo.apilamatraca.dtos.ErrorResponse;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public class UsernameAlreadyExistsException extends Exception {


    public UsernameAlreadyExistsException(String message){
        super(message);
    }
}
