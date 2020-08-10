package com.ex1cartoesapi.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Card card;

    @DecimalMin(value = "0", message = "Valor da compra deve ser maior ou igual a zero")
    @Digits(integer = 6, fraction = 2, message = "Valor da compra fora do padrão")
    private double valordacompra;

    @NotNull(message = "Data da compra nao pode ser nulo ")
    @NotBlank(message ="Data da compra nao pode ser em branco.")
    private String datadacompra;

    @NotNull(message = "Local da compra nao pode ser nulo ")
    @NotBlank(message ="Local da compra nao pode ser em branco.")
    private String localdacompra;

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

    public double getValordacompra() {
        return valordacompra;
    }

    public void setValordacompra(double valordacompra) {
        this.valordacompra = valordacompra;
    }

    public String getDatadacompra() {
        return datadacompra;
    }

    public void setDatadacompra(String datadacompra) {
        this.datadacompra = datadacompra;
    }

    public String getLocaldacompra() {
        return localdacompra;
    }

    public void setLocaldacompra(String localdacompra) {
        this.localdacompra = localdacompra;
    }
}
