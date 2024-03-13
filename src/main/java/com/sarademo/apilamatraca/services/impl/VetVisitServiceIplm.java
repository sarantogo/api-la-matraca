package com.sarademo.apilamatraca.services.impl;

import com.sarademo.apilamatraca.dtos.VetVisitDto;
import com.sarademo.apilamatraca.entities.VetVisit;
import com.sarademo.apilamatraca.mappers.VetVisitMapper;
import com.sarademo.apilamatraca.repositories.VetVisitRepository;
import com.sarademo.apilamatraca.services.VetVisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VetVisitServiceIplm implements VetVisitService {

    @Autowired
    VetVisitRepository vetVisitRepository;

    @Autowired
    VetVisitMapper visitMapper;

    public Long saveNewVisit(VetVisitDto dto){
        VetVisit visit = visitMapper.visitDtoToVisit(dto);

        return vetVisitRepository.save(visit).getId();
    }
}
