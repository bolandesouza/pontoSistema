package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Empresa extends Usuario {
    @Column(name = "id_empresa", nullable = false)
    private Long id;
    @Column(name = "descricao_empresa", nullable = false)
    private String descricao;
    @Column(name = "cnpj_empresa", nullable = false)
    private String cnpj;
    @Column(name = "enderco_empresa", nullable = false)
    private String endereco;
    @Column(name = "bairro_empresa", nullable = false)
    private String bairo;
    @Column(name = "cidade_empresa", nullable = false)
    private String cidade;
    @Column(name = "estado_empresa", nullable = false)
    private String estado;
    @Column(name = "telefone_empresa", nullable = false)
    private String telefone;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String getEndereco() {
        return endereco;
    }

    @Override
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairo() {
        return bairo;
    }

    public void setBairo(String bairo) {
        this.bairo = bairo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
