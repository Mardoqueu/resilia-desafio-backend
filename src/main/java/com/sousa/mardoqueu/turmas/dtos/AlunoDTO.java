package com.sousa.mardoqueu.turmas.dtos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sousa.mardoqueu.turmas.model.Aluno;

import java.io.Serializable;

public class AlunoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id = 0L;
    private String nome;
    private String cpf;
    private String email;

    // construtor
    public AlunoDTO(Aluno aluno) {
        this.id = Long.valueOf(aluno.getId());
        this.nome = aluno.getNome();
        this.cpf = aluno.getCpf();
        this.email = aluno.getEmail();
    }

    public AlunoDTO() {

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @JsonCreator
    public AlunoDTO(@JsonProperty("id") Long id,
                    @JsonProperty("nome") String nome,
                    @JsonProperty("cpf") String cpf,
                    @JsonProperty("email") String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }
}
