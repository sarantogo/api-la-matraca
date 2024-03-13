package com.sarademo.apilamatraca.services.impl;

import com.sarademo.apilamatraca.dtos.CowResponseDto;
import com.sarademo.apilamatraca.dtos.CreateCowDto;
import com.sarademo.apilamatraca.entities.Cow;
import com.sarademo.apilamatraca.mappers.CowResponseMapper;
import com.sarademo.apilamatraca.mappers.CreateCowMapper;
import com.sarademo.apilamatraca.mappers.PurchaseMapper;
import com.sarademo.apilamatraca.mappers.VaccineMapper;
import com.sarademo.apilamatraca.repositories.CowRepository;
import com.sarademo.apilamatraca.services.CowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.MethodArgumentNotValidException;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Service
public class CowServiceIplm implements CowService {

    @Autowired
    CowRepository cowRepository;

    @Autowired
    CreateCowMapper cowMapper;

    @Autowired
    CowResponseMapper cowResponseMapper;

    public Long saveNewCow(CreateCowDto cowDto){

        if(cowDto.isWasBought() && cowDto.getPurchase() == null){
            throw new IllegalArgumentException("wasBought is set to true, please enter a purchase");
        }
        if(cowDto.getPurchase().getPurchaseDate() == null || cowDto.getPurchase().getPurchaseDate().isEmpty()){
            throw new IllegalArgumentException("Purchase Date is required");
        }
        if(cowDto.getPurchase().getPrice() == null){
            throw new IllegalArgumentException("Purchase price is required");
        }
        if(cowDto.getPurchase().getSeller() != null){
            if(cowDto.getPurchase().getSeller().length() <2 ){
                throw new IllegalArgumentException("Seller name should have at least 2 characters");
            }
        }

        Cow cow = cowMapper.createDtoToCow(cowDto);
        cow.setCreatedAt(Date.valueOf(LocalDate.now()));
        cow.setLastUpdate(Date.valueOf(LocalDate.now()));

        return cowRepository.save(cow).getId();
    }

    public List<CowResponseDto> getAllCows(){
        List<Cow> cows = cowRepository.findAll();
        return cowResponseMapper.cowsListToCowsResponseDtos(cows);
    }

}
