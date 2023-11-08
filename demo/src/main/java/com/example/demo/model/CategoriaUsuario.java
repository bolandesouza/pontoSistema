package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class CategoriaUsuario {
    @Column(name = "id_usuario" , nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
