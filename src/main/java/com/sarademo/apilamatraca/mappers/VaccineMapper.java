package com.sarademo.apilamatraca.mappers;

import com.sarademo.apilamatraca.dtos.VaccineDto;
import com.sarademo.apilamatraca.entities.Cow;
import com.sarademo.apilamatraca.entities.Vaccine;
import com.sarademo.apilamatraca.repositories.CowRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public abstract class VaccineMapper {

    @Mapping(target = "vaccineDate", source = "vaccineDate", qualifiedByName = "stringToDate")
//    @Mapping(target = "cow", source = "cowId", ignore = true)
    public abstract Vaccine vaccineDtoToVaccine(VaccineDto dto);

    @Named("stringToDate")
    public Date map(String date){
        return Date.valueOf(LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy")));
    }

    @Mapping(target = "cowId", source = "cow.id")
    @Mapping(target = "vaccineDate", source = "vaccineDate", dateFormat = "dd-MM-yyyy")
    public abstract VaccineDto vaccineToVaccineDto(Vaccine vaccine);
}
