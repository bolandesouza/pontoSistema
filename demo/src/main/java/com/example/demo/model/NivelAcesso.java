package com.example.demo.model;

import javax.persistence.*;

@Entity
public class NivelAcesso extends EntityId{
    @Column(name = "descricao_nivel", nullable = false)
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "NivelAcesso{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
