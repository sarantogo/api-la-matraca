package com.sarademo.apilamatraca.mappers;

import com.sarademo.apilamatraca.dtos.UserDto;
import com.sarademo.apilamatraca.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User userDtoToUser(UserDto dto);

    UserDto userToUserDto(User user);
}
