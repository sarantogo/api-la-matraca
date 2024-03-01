package com.sarademo.apilamatraca.dtos;

import com.sarademo.apilamatraca.entities.Purchase;
import com.sarademo.apilamatraca.entities.Vaccine;

import java.math.BigDecimal;
import java.util.List;

public class CreateCowDto {

    private String name;
    private Integer age;
    private String breed;
    private boolean wasBought;
    private boolean isSold;
    private BigDecimal weight;

    private Purchase purchase;

    private List<Vaccine> vaccineList;


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

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    public List<Vaccine> getVaccineList() {
        return vaccineList;
    }

    public void setVaccineList(List<Vaccine> vaccineList) {
        this.vaccineList = vaccineList;
    }
}
