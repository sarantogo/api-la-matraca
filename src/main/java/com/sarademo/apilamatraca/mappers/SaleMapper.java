package com.sarademo.apilamatraca.mappers;

import com.sarademo.apilamatraca.dtos.SaleDto;
import com.sarademo.apilamatraca.entities.Cow;
import com.sarademo.apilamatraca.entities.Sale;
import com.sarademo.apilamatraca.repositories.CowRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Mapper(componentModel = "spring")
public abstract class SaleMapper {

    @Autowired
    CowRepository cowRepository;
    public Sale saleDtoToSale(SaleDto dto){
        Cow cow = cowRepository.findById(dto.getCowId()).orElse(null);

        Sale newSale = new Sale();
        newSale.setSaleDate(Date.valueOf(LocalDate.parse(dto.getSaleDate(), DateTimeFormatter.ofPattern("dd-MM-yyyy"))));
        newSale.setCow(cow);
        newSale.setBuyer(dto.getBuyer());
        newSale.setPrice(dto.getPrice());

        return newSale;
    }

    @Mapping(target = "cowId", source = "cow.id")
    @Mapping(target = "saleDate", source = "saleDate", dateFormat = "dd-MM-yyyy")
    public abstract SaleDto saleToSaleDto(Sale sale);

}
