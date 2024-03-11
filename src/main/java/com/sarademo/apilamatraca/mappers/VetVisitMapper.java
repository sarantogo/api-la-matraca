package com.sarademo.apilamatraca.mappers;

import com.sarademo.apilamatraca.dtos.VetVisitDto;
import com.sarademo.apilamatraca.entities.Cow;
import com.sarademo.apilamatraca.entities.VetVisit;
import com.sarademo.apilamatraca.repositories.CowRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Mapper(componentModel = "spring")
public abstract class VetVisitMapper {

    @Autowired
    CowRepository cowRepository;

    public VetVisit visitDtoToVisit(VetVisitDto dto){
        Cow cow = cowRepository.findById(dto.getCowId()).orElse(null);

        VetVisit visit = new VetVisit();

        visit.setCow(cow);
        visit.setVisitDate(Date.valueOf(LocalDate.parse(dto.getVisitDate(), DateTimeFormatter.ofPattern("dd-MM-yyyy"))));
        visit.setVet(dto.getVet());
        visit.setPrice(dto.getPrice());

        return visit;
    }

    @Mapping(target = "cowId", source = "cow.id")
    @Mapping(target = "visitDate", source = "visitDate", dateFormat = "yyyy-MM-dd")
    public abstract VetVisitDto visitToVisitDto(VetVisit visit);

}
