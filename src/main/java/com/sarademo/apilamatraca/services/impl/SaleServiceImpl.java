package com.sarademo.apilamatraca.services.impl;

import com.sarademo.apilamatraca.dtos.SaleDto;
import com.sarademo.apilamatraca.entities.Cow;
import com.sarademo.apilamatraca.entities.Sale;
import com.sarademo.apilamatraca.mappers.SaleMapper;
import com.sarademo.apilamatraca.repositories.CowRepository;
import com.sarademo.apilamatraca.repositories.SaleRepository;
import com.sarademo.apilamatraca.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class SaleServiceImpl implements SaleService {

    @Autowired
    SaleRepository saleRepository;
    @Autowired
    SaleMapper saleMapper;
    @Autowired
    CowRepository cowRepository;

public Long saveNewSale(SaleDto dto){

    Sale sale = saleMapper.saleDtoToSale(dto);
    Cow cow = cowRepository.findById(dto.getCowId()).orElse(null);


    if(cow!=null){
        Long newSaleId = saleRepository.save(sale).getId();
        cow.setSold(true);
        cowRepository.save(cow);
        return newSaleId;
    } else {
        throw new NoSuchElementException("Cow with the requested cowId not found.");
    }

}


}
