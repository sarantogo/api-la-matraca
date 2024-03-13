package com.sarademo.apilamatraca.dtos;

import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

public class SaleDto {

    private Long id;
    @NotNull(message = "cowId is required")
    private Long cowId;
    @NotEmpty(message = "Sale Date is required")
    private String saleDate;
    @NotNull(message = "Price is required")
    @PositiveOrZero(message = "Price should be a positive number or zero")
    private BigDecimal price;
    @Size(min = 2, message = "Buyer name should have at least 2 characters")
    private String buyer;

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

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }
}
