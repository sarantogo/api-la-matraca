package com.sarademo.apilamatraca.services;

import com.sarademo.apilamatraca.dtos.SaleDto;


public interface SaleService {

    Long saveNewSale(SaleDto dto);
}
