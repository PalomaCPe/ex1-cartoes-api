package com.ex1cartoesapi.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Buy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Card card;

    @DecimalMin(value = "0", message = "Preencher a valor da compra")
    @Digits(integer = 6, fraction = 2, message = "Valor da compra inválido")
    private double value;

    @NotNull(message = "Preencher a data da compra")
    @NotBlank(message ="Preencher a data da compra")
    private String date;

    @NotNull(message = "Informe onde a compra foi realizada")
    @NotBlank(message ="Informe onde a compra foi realizada")
    private String place;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
