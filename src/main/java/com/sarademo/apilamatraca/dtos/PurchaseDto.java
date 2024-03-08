package com.sarademo.apilamatraca.dtos;

import com.sarademo.apilamatraca.entities.Purchase;

import java.math.BigDecimal;
import java.sql.Date;

public class PurchaseDto {

    private Long id;
    private Long cowId;
    private String purchaseDate;
    private BigDecimal price;
    private String seller;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCow() {return cowId;}

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
