package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class BancoHoras extends Usuario {
    @Column(name = "id_banco_horas",nullable = false)
    private long idBancoHoras;
    @Column(name = "id_usuario",nullable = false)
    private long idUsuario;

    public long getIdBancoHoras() {
        return idBancoHoras;
    }

    public void setIdBancoHoras(long idBancoHoras) {
        this.idBancoHoras = idBancoHoras;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }
}



