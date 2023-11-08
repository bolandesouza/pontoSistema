package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Empresa extends Usuario {
    @Column(name = "cpf", nullable = false)
    private String cpf;
    @Column(name = "limite_credito", nullable = false)
    private Double limiteCredito;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(Double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
}
