package com.ap.demo.models;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Entity
@Table (name = "TBL_PROJETO")
public class ProjetoModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Long id;
    @Column (name = "nome_projeto")
    private String nome;
    @Column (name = "inicio_projeto")
    private LocalDate dataInicio;
    @Column (name = "fim_projeto")
    private LocalDate dataFim;

    public ProjetoModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }
}
