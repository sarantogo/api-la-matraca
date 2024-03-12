package com.sarademo.apilamatraca.services;

import com.sarademo.apilamatraca.dtos.UserDto;
import com.sarademo.apilamatraca.entities.User;
import com.sarademo.apilamatraca.exception.UsernameAlreadyExistsException;

public interface UserService {
    Long save(UserDto user) throws UsernameAlreadyExistsException;
}
