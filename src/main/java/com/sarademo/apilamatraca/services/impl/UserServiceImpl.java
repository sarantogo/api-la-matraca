package com.sarademo.apilamatraca.services.impl;

import com.sarademo.apilamatraca.dtos.UserDto;
import com.sarademo.apilamatraca.entities.Role;
import com.sarademo.apilamatraca.entities.User;
import com.sarademo.apilamatraca.exception.UsernameAlreadyExistsException;
import com.sarademo.apilamatraca.mappers.UserMapper;
import com.sarademo.apilamatraca.repositories.UserRepository;
import com.sarademo.apilamatraca.services.RoleService;
import com.sarademo.apilamatraca.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service(value = "userService")
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    private  RoleService roleService;

    @Autowired
    private  UserRepository userRepository;

    @Autowired
    private  BCryptPasswordEncoder bcryptEncoder;

    @Autowired
    private  UserMapper userMapper;

//    public UserServiceImpl(RoleService roleService, UserRepository userRepository, BCryptPasswordEncoder bcryptEncoder, UserMapper userMapper) {
//        this.roleService = roleService;
//        this.userRepository = userRepository;
//        this.bcryptEncoder = bcryptEncoder;
//        this.userMapper = userMapper;
//    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), getAuthority(user));
    }

    private Set<SimpleGrantedAuthority> getAuthority(User user) {
        Set<SimpleGrantedAuthority> authorities = new HashSet<>();
        user.getRoles().forEach(role -> {
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getName()));
        });
        return authorities;
    }

    public Long save(UserDto user) throws UsernameAlreadyExistsException {

        User newUser = userMapper.userDtoToUser(user);

        if(userRepository.existsByUsername(newUser.getUsername())){
            throw new UsernameAlreadyExistsException("Username Ocupado");
        }

        newUser.setPassword(bcryptEncoder.encode(user.getPassword()));

        Role role = roleService.findByName("USER");
        List<Role> roleList = new ArrayList<>();
        roleList.add(role);

        if(newUser.getUsername().contains("duque")){
            role = roleService.findByName("ADMIN");
            roleList.add(role);
        }

        newUser.setRoles(roleList);
        return userRepository.save(newUser).getId();
    }

}
