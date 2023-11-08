package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class TipoData {
    @Column(name = "id_tipo_data" , nullable = false)
    private long id;
    @Column(name = "descricao_tipo_data" , nullable = false)
    private String descricao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
