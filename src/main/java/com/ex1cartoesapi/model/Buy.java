package com.ex1cartoesapi.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "buy")
@EntityListeners(AuditingEntityListener.class)
public class Buy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Card card;

    @NotNull(message = "Informe uma descrição")
    @NotBlank(message ="Informe uma descrição")
    private String description;

    @DecimalMin(value = "0", message = "Preencher a valor da compra")
    @Digits(integer = 6, fraction = 2, message = "Valor da compra inválido")
    private double value;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
