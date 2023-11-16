package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Calendario extends EntityId{
    @Column(name = "tipo_data_calendario", nullable = false)
    private TipoData tipoData;
    @Column(name = "descricao_calendario", nullable = false)
    private String descricao;

    public TipoData getTipoData() {
        return tipoData;
    }

    public void setTipoData(TipoData tipoData) {
        this.tipoData = tipoData;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Calendario{" +
                "tipoData=" + tipoData +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
