package com.devrafa.mapavendas.modelo;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "venda")
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String item;
    private String cliente;
    private String status;
    private BigDecimal valor;

    private LocalDate dataVenda;

    public Venda() {
    }

    public Venda(String item, String cliente, String status, BigDecimal valor, LocalDate dataVenda) {
        this.item = item;
        this.cliente = cliente;
        this.status = status;
        this.valor = valor;
        this.dataVenda = dataVenda;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }
}
