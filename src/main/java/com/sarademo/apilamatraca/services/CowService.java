package com.sarademo.apilamatraca.services;

import com.sarademo.apilamatraca.dtos.CowResponseDto;
import com.sarademo.apilamatraca.dtos.CreateCowDto;
import com.sarademo.apilamatraca.entities.Cow;

import java.util.List;

public interface CowService {

    Cow saveNewCow(CreateCowDto cow);
//    List<CowResponseDto> getAllCows();
//    CowResponseDto getCowById(Long id);
//    Cow updateCow(CowResponseDto cow);
//    void deleteCow(CowResponseDto cow);

}
