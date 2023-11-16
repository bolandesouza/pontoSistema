package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Empresa extends EntityId{
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


    public String getEndereco() {
        return endereco;
    }


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


    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "descricao='" + descricao + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", endereco='" + endereco + '\'' +
                ", bairo='" + bairo + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
