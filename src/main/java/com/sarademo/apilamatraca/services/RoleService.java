package com.sarademo.apilamatraca.services;

import com.sarademo.apilamatraca.entities.Role;

public interface RoleService {

    Role findByName(String name);
}
