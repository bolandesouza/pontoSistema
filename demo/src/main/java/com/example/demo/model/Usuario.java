package com.example.demo.model;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
public class Usuario extends EntityId{
    @Column(name = "categoria_usuario" , nullable = false)
    private String categoria;
    @Column(name = "nome_usuario" , nullable = false)
    private String nome;
    @ManyToOne
    @JoinColumn(name = "empresa_usuario" , nullable = false)
    private Empresa empresa;
    @ManyToOne
    @JoinColumn(name = "nivel_acesso_usuario" , nullable = false)
    private NivelAcesso nivelAcesso;
    @ManyToOne
    @JoinColumn(name = "jornada_trabalho_usuario" , nullable = false)
    private  JornadaTrabalho jornadaTrabalho;
    @Column(name = "tolerancia_usuario" , nullable = false)
    private Double tolerancia;
    @Column(name = "inicio_jornada_usuario" , nullable = false)
    private LocalDateTime inicioJornada;
    @Column(name = "final_jornada_usuario" , nullable = false)
    private LocalDateTime finalJornada;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public NivelAcesso getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(NivelAcesso nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public JornadaTrabalho getJornadaTrabalho() {
        return jornadaTrabalho;
    }

    public void setJornadaTrabalho(JornadaTrabalho jornadaTrabalho) {
        this.jornadaTrabalho = jornadaTrabalho;
    }

    public Double getTolerancia() {
        return tolerancia;
    }

    public void setTolerancia(Double tolerancia) {
        this.tolerancia = tolerancia;
    }

    public LocalDateTime getInicioJornada() {
        return inicioJornada;
    }

    public void setInicioJornada(LocalDateTime inicioJornada) {
        this.inicioJornada = inicioJornada;
    }

    public LocalDateTime getFinalJornada() {
        return finalJornada;
    }

    public void setFinalJornada(LocalDateTime finalJornada) {
        this.finalJornada = finalJornada;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "categoria='" + categoria + '\'' +
                ", nome='" + nome + '\'' +
                ", empresa=" + empresa +
                ", nivelAcesso=" + nivelAcesso +
                ", jornadaTrabalho=" + jornadaTrabalho +
                ", tolerancia=" + tolerancia +
                ", inicioJornada=" + inicioJornada +
                ", finalJornada=" + finalJornada +
                '}';
    }
}

