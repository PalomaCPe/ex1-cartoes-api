package com.ex1cartoesapi.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "card")
@EntityListeners(AuditingEntityListener.class)
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String number;
    private int cvv;
    private String dateValid;
    private String dateBestBuy;
    private Status status;
    private double cardLimit;

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

    public double getCardLimit() {
        return cardLimit;
    }

    public void setCardLimit(double cardLimit) {
        this.cardLimit = cardLimit;
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
