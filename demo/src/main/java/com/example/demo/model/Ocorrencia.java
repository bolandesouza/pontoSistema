package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Ocorrencia {
    @Column(name = "id_ocorrencia" , nullable = false)
    private long id;
    @Column(name = "nome_ocorrencia" , nullable = false)
    private String nome;
    @Column(name = "descricao_ocorrencia" , nullable = false)
    private String descricao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
