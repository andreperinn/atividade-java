package com.ap.demo.models;

import jakarta.persistence.*;

@Entity
public class CategoriaModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Long id;
    @Column (name = "nome_descricao")
    private String nome;
    @Column (name = "descricao")
    private String descricao;

    public CategoriaModel() {
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
