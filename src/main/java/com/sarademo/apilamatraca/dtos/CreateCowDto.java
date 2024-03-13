package com.sarademo.apilamatraca.dtos;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

import java.util.List;


public class CreateCowDto {

    @NotEmpty(message = "Name is required")
    @Size(min = 2, message = "Name should have at least 2 characters")
    private String name;
    @NotNull(message = "Age is required")
    @Positive(message = "Age should be a positive number")
    private Integer age;
    @NotEmpty(message = "Breed is required")
    private String breed;
    @NotNull(message = "Please specify if was bought or not")
    private boolean wasBought;
    @NotNull(message = "Please specify if has been sold or not")
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

}
