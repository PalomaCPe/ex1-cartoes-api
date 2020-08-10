package com.ex1cartoesapi.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cartao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String numero;
    private int cvv;
    private String dataValidade;
    private String dataDaMelhorCompra;
    private Status status;
    private double limite;

    public Cartao() {
    }


    @OneToMany
    public List<Compra> compra;

    //Relacionamento de muitos cartões para um cliente.
    @ManyToOne
    public Cliente cliente;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getDataDaMelhorCompra() {
        return dataDaMelhorCompra;
    }

    public void setDataDaMelhorCompra(String dataDaMelhorCompra) {
        this.dataDaMelhorCompra = dataDaMelhorCompra;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public List<Compra> getCompra() {
        return compra;
    }

    public void setCompra(List<Compra> compra) {
        this.compra = compra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
