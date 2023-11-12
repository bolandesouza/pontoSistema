package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public class Usuario extends EntityId {
    @Column(name = "id_usuario" , nullable = false)
    private Long id;
    @Column(name = "categoria_usuario" , nullable = false)
    private CategoriaUsuario categoriaUsuario;
    @Column(name = "nome_usuario" , nullable = false)
    private String nome;
    @Column(name = "empresa_usuario" , nullable = false)
    private Empresa empresa;
    @Column(name = "nivel_acesso_usuario" , nullable = false)
    private NivelAcesso nivelAcesso;
    @Column(name = "jornada_trabalho_usuario" , nullable = false)
    private  JornadaTrabalho jornadaTrabalho;
    @Column(name = "tolerancia_usuario" , nullable = false)
    private Double tolerancia;
    @Column(name = "inicio_jornada_usuario" , nullable = false)
    private LocalDateTime inicioJornada;
    @Column(name = "final_jornada_usuario" , nullable = false)
    private LocalDateTime finalJornada;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public CategoriaUsuario getCategoriaUsuario() {
        return categoriaUsuario;
    }

    public void setCategoriaUsuario(CategoriaUsuario categoriaUsuario) {
        this.categoriaUsuario = categoriaUsuario;
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
}

