package com.sousa.mardoqueu.turmas.controller;

import com.sousa.mardoqueu.turmas.model.Aluno;
import com.sousa.mardoqueu.turmas.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoService alunoService;

    @PostMapping
    public ResponseEntity<Aluno> cadastrarAluno(@RequestBody Aluno aluno) {
        Aluno alunoSalvo = alunoService.cadastrarAluno(aluno);
        return ResponseEntity.created(URI.create("/alunos/" + alunoSalvo.getId())).body(alunoSalvo);
    }

    @GetMapping
    public List<Aluno> listarAlunos() {
        return alunoService.listarAlunos();
    }

    // outros métodos, como atualizarAluno, excluirAluno, etc.
}

