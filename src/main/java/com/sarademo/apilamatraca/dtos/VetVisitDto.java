package com.sarademo.apilamatraca.dtos;

import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;

public class VetVisitDto {

    private Long id;
    @NotNull(message = "cowId is required")
    private Long cowId;
    @NotEmpty(message = "Visit Date is required")
    private String visitDate;
    @PositiveOrZero(message = "Price should be a positive number or zero")
    private BigDecimal price;
    @Size(min = 2, message = "Vet name should have at least 2 characters")
    private String vet;

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

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getVet() {
        return vet;
    }

    public void setVet(String vet) {
        this.vet = vet;
    }
}
