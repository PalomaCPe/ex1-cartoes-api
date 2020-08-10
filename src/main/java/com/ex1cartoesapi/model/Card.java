package com.ex1cartoesapi.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String number;
    private int cvv;
    private String dateValid;
    private String dateBestBuy;
    private Status status;
    private double limit;

    public Card() {
    }

    @OneToMany
    public List<Buy> buy;

    //Relacionamento de muitos cartões para um cliente.
    @ManyToOne
    public Customer customer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getDateValid() {
        return dateValid;
    }

    public void setDateValid(String dateValid) {
        this.dateValid = dateValid;
    }

    public String getDateBestBuy() {
        return dateBestBuy;
    }

    public void setDateBestBuy(String dateBestBuy) {
        this.dateBestBuy = dateBestBuy;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public List<Buy> getBuy() {
        return buy;
    }

    public void setBuy(List<Buy> buy) {
        this.buy = buy;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
