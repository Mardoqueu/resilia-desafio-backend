package com.sousa.mardoqueu.turmas.controller;

import com.sousa.mardoqueu.turmas.dtos.MatriculaDTO;
import com.sousa.mardoqueu.turmas.model.Matricula;
import com.sousa.mardoqueu.turmas.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
    @Autowired
    private MatriculaService matriculaService;

    @PostMapping
    public ResponseEntity<Matricula> matricularAluno(@RequestBody MatriculaDTO matriculaDTO) {
        Matricula matricula = matriculaService.matricularAluno(matriculaDTO.getTurmaId(), matriculaDTO.getAlunoId());
        return ResponseEntity.created(URI.create("/matriculas/" + matricula.getId())).body(matricula);
    }


    // outros métodos, como desmatricularAluno, listarMatriculas, etc.
}
