package com.example.demo.model;

import javax.persistence.*;

@Entity
public class TipoData extends EntityId{
    @Column(name = "descricao_tipo_data", nullable = false)
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "TipoData{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
