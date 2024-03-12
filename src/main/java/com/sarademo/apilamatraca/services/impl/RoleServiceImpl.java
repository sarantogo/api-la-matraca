package com.sarademo.apilamatraca.services.impl;

import com.sarademo.apilamatraca.entities.Role;
import com.sarademo.apilamatraca.repositories.RoleRepository;
import com.sarademo.apilamatraca.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public Role findByName(String name) {
        return roleRepository.findRoleByName(name);
    }

}
