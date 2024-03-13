package com.sarademo.apilamatraca.mappers;

import com.sarademo.apilamatraca.dtos.PurchaseDto;
import com.sarademo.apilamatraca.entities.Cow;
import com.sarademo.apilamatraca.entities.Purchase;
import com.sarademo.apilamatraca.repositories.CowRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Mapper(componentModel = "spring")
public abstract class PurchaseMapper {

    @Mapping(target = "purchaseDate", source = "purchaseDate", qualifiedByName = "stringToDate")
//    @Mapping(target = "cow", source = "cowId", ignore = true)
    public abstract Purchase purchaseDtoToPurchase(PurchaseDto dto);

    @Named("stringToDate")
    public Date map(String date){
        return Date.valueOf(LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy")));
    }

    @Mapping(target = "cowId", source = "cow.id")
    @Mapping(target = "purchaseDate", source = "purchaseDate", dateFormat = "dd-MM-yyyy")
    public abstract PurchaseDto purchaseToPurchaseDto(Purchase purchase);
}
