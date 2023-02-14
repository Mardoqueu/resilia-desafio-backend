package com.sousa.mardoqueu.turmas.controller;

import com.sousa.mardoqueu.turmas.model.Matricula;
import com.sousa.mardoqueu.turmas.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
    @Autowired
    private MatriculaService matriculaService;

    @PostMapping
    public ResponseEntity<Matricula> matricularAluno(@RequestParam Long turmaId, @RequestParam Long alunoId) {
        Matricula matricula = matriculaService.matricularAluno(turmaId, alunoId);
        return ResponseEntity.created(URI.create("/matriculas/" + matricula.getId())).body(matricula);
    }

    // outros métodos, como desmatricularAluno, listarMatriculas, etc.
}
