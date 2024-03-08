package com.sarademo.apilamatraca.dtos;

import com.sarademo.apilamatraca.entities.Cow;
import com.sarademo.apilamatraca.entities.Purchase;
import com.sarademo.apilamatraca.entities.Vaccine;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

public class CreateCowDto {

    private String name;
    private Integer age;
    private String breed;
    private boolean wasBought;
    private boolean isSold;
    private BigDecimal weight;
    private PurchaseDto purchase;
    private List<VaccineDto> vaccineList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isWasBought() {
        return wasBought;
    }

    public void setWasBought(boolean wasBought) {
        this.wasBought = wasBought;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public PurchaseDto getPurchase() {
        return purchase;
    }

    public void setPurchase(PurchaseDto purchase) {
        this.purchase = purchase;
    }

    public List<VaccineDto> getVaccineList() {
        return vaccineList;
    }

    public void setVaccineList(List<VaccineDto> vaccineList) {
        this.vaccineList = vaccineList;
    }

//    public Cow getCowFromDto(){
//        Cow cow = new Cow();
//        cow.setName(name);
//        cow.setAge(age);
//        cow.setBreed(breed);
//        cow.setWasBought(wasBought);
//        cow.setSold(isSold);
//        cow.setWeight(weight);
//        cow.setCreatedAt(Date.valueOf(LocalDate.now()));
//        cow.setLastUpdate(Date.valueOf(LocalDate.now()));
//        cow.setPurchase(purchase.getPurchaseFromDto());
//        cow.setVaccines(vaccineList.stream().map(VaccineDto::getVaccineFromDto).collect(Collectors.toList()));
//
//        return cow;
//
//    }
}
