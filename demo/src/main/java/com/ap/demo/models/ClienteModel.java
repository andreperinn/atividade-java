package com.ap.demo.models;

import jakarta.persistence.*;

@Entity
public class ClienteModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Long id;
    @Column (name = "cli_nome")
    private String nome;
    @Column (name = "cli_email")
    private String email;
    @Column (name = "cli_telefone")
    private String telefone;

    public ClienteModel() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
