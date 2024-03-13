package com.sarademo.apilamatraca.services;

import com.sarademo.apilamatraca.dtos.VetVisitDto;

public interface VetVisitService {

    Long saveNewVisit(VetVisitDto dto);
}
