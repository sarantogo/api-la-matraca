package com.sarademo.apilamatraca.dtos;

import com.sarademo.apilamatraca.entities.Cow;
import com.sarademo.apilamatraca.entities.Vaccine;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

public class VaccineDto {

    private Long id;
    private Cow cow;
    private String vaccineDate;
    private BigDecimal price;
    private String name;
    private BigDecimal dose;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cow getCow() {
        return cow;
    }

    public void setCowId(Cow cow) {
        this.cow = cow;
    }

    public String getVaccineDate() {
        return vaccineDate;
    }

    public void setVaccineDate(String vaccineDate) {
        this.vaccineDate = vaccineDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getDose() {
        return dose;
    }

    public void setDose(BigDecimal dose) {
        this.dose = dose;
    }

    public Vaccine getVaccineFromDto(){
        Vaccine vaccine = new Vaccine();
        vaccine.setVaccineDate(Date.valueOf(vaccineDate));
        vaccine.setName(name);
        vaccine.setDose(dose);
        vaccine.setPrice(price);

        return vaccine;
    }


}
