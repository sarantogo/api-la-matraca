package com.sarademo.apilamatraca.mappers;

import com.sarademo.apilamatraca.dtos.CreateCowDto;
import com.sarademo.apilamatraca.entities.Cow;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.Optional;

@Mapper(componentModel = "spring", uses = {PurchaseMapper.class, VaccineMapper.class})
public interface CreateCowMapper {

    @Mapping(target = "vaccines", source = "vaccineList")
    Cow createDtoToCow (CreateCowDto dto);

    @AfterMapping
    default void setCow(@MappingTarget Cow cow){

        Optional.ofNullable(cow.getPurchase()).ifPresent(purchase -> purchase.setCow(cow));

        Optional.ofNullable(cow.getVaccines()).ifPresent(vaccines -> vaccines.forEach(vaccine -> vaccine.setCow(cow)));
    }

}
