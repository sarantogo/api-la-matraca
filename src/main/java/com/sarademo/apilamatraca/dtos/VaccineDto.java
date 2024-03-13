package com.sarademo.apilamatraca.dtos;

import com.sarademo.apilamatraca.entities.Vaccine;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

public class VaccineDto {

    private Long id;
    private Long cowId;
    @NotEmpty(message = "Vaccine Date is required")
    private String vaccineDate;
    @PositiveOrZero(message = "Price should be a positive number or zero")
    private BigDecimal price;
    @NotEmpty(message = "Name is required")
    @Size(min = 2, message = "Name should have at least 2 characters")
    private String name;
    @Positive(message = "Dose should be a positive number")
    private BigDecimal dose;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCowId() {
        return cowId;
    }

    public void setCowId(Long cowId) {
        this.cowId = cowId;
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

//    public Vaccine getVaccineFromDto(){
//        Vaccine vaccine = new Vaccine();
//        vaccine.setVaccineDate(Date.valueOf(vaccineDate));
//        vaccine.setName(name);
//        vaccine.setDose(dose);
//        vaccine.setPrice(price);
//
//        return vaccine;
//    }


}
