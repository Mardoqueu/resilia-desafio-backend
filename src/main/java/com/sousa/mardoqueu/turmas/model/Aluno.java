package com.sousa.mardoqueu.turmas.model;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "aluno")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cpf;

    @Column(nullable = false)
    private String email;

    @OneToMany(mappedBy = "aluno")
    private List<Matricula> matriculas;

    // construtores, getters e setters
}
