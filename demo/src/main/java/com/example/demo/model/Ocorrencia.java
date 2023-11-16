package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Ocorrencia extends EntityId{
    @Column(name = "nome_ocorrencia", nullable = false)
    private String nome;
    @Column(name = "descricao_ocorrencia", nullable = false)
    private String descricao;

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

    @Override
    public String toString() {
        return "Ocorrencia{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
