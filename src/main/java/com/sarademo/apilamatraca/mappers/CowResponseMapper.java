package com.sarademo.apilamatraca.mappers;

import com.sarademo.apilamatraca.dtos.CowResponseDto;
import com.sarademo.apilamatraca.dtos.VaccineDto;
import com.sarademo.apilamatraca.dtos.VetVisitDto;
import com.sarademo.apilamatraca.entities.Cow;
import com.sarademo.apilamatraca.entities.Vaccine;
import com.sarademo.apilamatraca.entities.VetVisit;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class CowResponseMapper {

    @Autowired
    VaccineMapper vaccineMapper;

    @Autowired
    VetVisitMapper visitMapper;

    @Autowired
    SaleMapper saleMapper;

    @Autowired
    PurchaseMapper purchaseMapper;

    @IterableMapping(qualifiedByName = "cowToCowResponseDto")
    public abstract List<CowResponseDto> cowsListToCowsResponseDtos(List<Cow> cows);
    @Named("cowToCowResponseDto")
    public CowResponseDto cowToCowResponseDto(Cow cow){
        CowResponseDto dto = new CowResponseDto();
        List<Vaccine> vaccines = cow.getVaccines();
        List<VetVisit> visits = cow.getVetVisits();

        if(!vaccines.isEmpty()){
            VaccineDto vaccineDto = vaccineMapper.vaccineToVaccineDto(vaccines.get(vaccines.size()-1));
            dto.setVaccine(vaccineDto);
        }
        if(!visits.isEmpty()){
            VetVisitDto visitDto = visitMapper.visitToVisitDto(visits.get(visits.size()-1));
            dto.setVetVisit(visitDto);
        }

        dto.setAge(cow.getAge());
        dto.setName(cow.getName());
        dto.setId(cow.getId());
        dto.setBreed(cow.getBreed());
        dto.setSale(saleMapper.saleToSaleDto(cow.getSale()));
        dto.setPurchase(purchaseMapper.purchaseToPurchaseDto(cow.getPurchase()));
        dto.setSold(cow.isSold());
        dto.setWasBought(cow.isWasBought());
        dto.setWeight(cow.getWeight());

        return dto;
    }


}
