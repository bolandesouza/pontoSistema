package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Calendario {
    @Column(name = "id_calendario" , nullable = false)
    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
