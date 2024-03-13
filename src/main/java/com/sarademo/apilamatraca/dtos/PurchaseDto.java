package com.sarademo.apilamatraca.dtos;

import com.sarademo.apilamatraca.entities.Purchase;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.sql.Date;

public class PurchaseDto {

    private Long id;
    private Long cowId;
    @NotEmpty(message = "Purchase Date is required")
    private String purchaseDate;
    @NotNull(message = "Price is required")
    @PositiveOrZero(message = "Price should be a positive number or zero")
    private BigDecimal price;
    @Size(min = 2, message = "Seller name should have at least 2 characters")
    private String seller;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCowId() {return cowId;}

    public void setCowId(Long cowId) {
        this.cowId = cowId;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

//    public Purchase getPurchaseFromDto(){
//        Purchase purchase = new Purchase();
//        purchase.setSeller(seller);
//        purchase.setPrice(price);
//        purchase.setPurchaseDate(Date.valueOf(purchaseDate));
//
//        return purchase;
//    }


}
