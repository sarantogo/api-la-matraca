package com.sarademo.apilamatraca.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name="cow")
public class Cow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private Integer age;

    @Column
    private String breed;

    @Column(name = "was_bought")
    private boolean wasBought;

    @Column(name = "is_sold")
    private boolean isSold;

    @Column
    private BigDecimal weight;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "last_update")
    private Date lastUpdate;

    @OneToOne(mappedBy = "cow")
    private Purchase purchase;

    @OneToOne(mappedBy = "cow")
    private Sale sale;

    @OneToMany(mappedBy = "cow")
    private List<Vaccine> vaccines;

    @OneToMany(mappedBy = "cow")
    private List<VetVisit> vetVisits;

    public Cow() {
    }

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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public List<Vaccine> getVaccines() {
        return vaccines;
    }

    public void setVaccines(List<Vaccine> vaccines) {
        this.vaccines = vaccines;
    }

    public List<VetVisit> getVetVisits() {
        return vetVisits;
    }

    public void setVetVisits(List<VetVisit> vetVisits) {
        this.vetVisits = vetVisits;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", wasBought=" + wasBought +
                ", isSold=" + isSold +
                ", weight=" + weight +
                ", createdAt=" + createdAt +
                ", lastUpdate=" + lastUpdate +
                ", purchase=" + purchase +
                ", sale=" + sale +
                ", vaccines=" + vaccines +
                ", vetVisits=" + vetVisits +
                '}';
    }
}
