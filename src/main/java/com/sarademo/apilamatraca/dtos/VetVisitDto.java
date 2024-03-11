package com.sarademo.apilamatraca.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

public class VetVisitDto {

    private Long id;
    private Long cowId;
    private String visitDate;
    private BigDecimal price;
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
