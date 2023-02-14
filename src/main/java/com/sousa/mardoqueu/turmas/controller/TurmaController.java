package com.sousa.mardoqueu.turmas.controller;

import com.sousa.mardoqueu.turmas.model.Turma;
import com.sousa.mardoqueu.turmas.service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/turmas")
public class TurmaController {
    @Autowired
    private TurmaService turmaService;

    @PostMapping
    public ResponseEntity<Turma> cadastrarTurma(@RequestBody Turma turma) {
        Turma turmaSalva = turmaService.cadastrarTurma(turma);
        return ResponseEntity.created(URI.create("/turmas/" + turmaSalva.getId())).body(turmaSalva);
    }

    @GetMapping
    public List<Turma> listarTurmas() {
        return turmaService.listarTurmas();
    }

    // outros métodos, como atualizarTurma, excluirTurma, etc.
}

