package com.example.demo.model;

import javax.persistence.*;

@Entity
public class JornadaTrabalho extends EntityId{
    @Column(name = "descricao_jornada", nullable = false)
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    @Override
    public String toString() {
        return "JornadaTrabalho{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
