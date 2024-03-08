package com.sarademo.apilamatraca.services.impl;

import com.sarademo.apilamatraca.dtos.CreateCowDto;
import com.sarademo.apilamatraca.entities.Cow;
import com.sarademo.apilamatraca.repositories.CowRepository;
import com.sarademo.apilamatraca.services.CowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CowServiceIplm implements CowService {

    @Autowired
    CowRepository cowRepository;

    public Cow saveNewCow(CreateCowDto cowDto){

        Cow cow = cowDto.getCowFromDto();

        return cowRepository.save(cow);
    }

}
