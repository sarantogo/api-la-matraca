package com.sarademo.apilamatraca.dtos;

import com.sarademo.apilamatraca.entities.Purchase;

import java.math.BigDecimal;

import java.time.LocalDate;
import java.util.List;

public class CowResponseDto {
    private Long id;
    private String name;
    private Integer age;
    private String breed;
    private BigDecimal weight;
    private boolean wasBought;
    private boolean isSold;
    private SaleDto sale;
    private PurchaseDto purchase;
    private VaccineDto vaccine;
    private VetVisitDto vetVisit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
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

    public SaleDto getSale() {
        return sale;
    }

    public void setSale(SaleDto sale) {
        this.sale = sale;
    }

    public PurchaseDto getPurchase() {
        return purchase;
    }

    public void setPurchase(PurchaseDto purchase) {
        this.purchase = purchase;
    }

    public VaccineDto getVaccine() {
        return vaccine;
    }

    public void setVaccine(VaccineDto vaccine) {
        this.vaccine = vaccine;
    }

    public VetVisitDto getVetVisit() {
        return vetVisit;
    }

    public void setVetVisit(VetVisitDto vetVisit) {
        this.vetVisit = vetVisit;
    }
}
