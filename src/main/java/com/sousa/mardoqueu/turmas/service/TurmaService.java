package com.sousa.mardoqueu.turmas.service;

import com.sousa.mardoqueu.turmas.model.Turma;
import com.sousa.mardoqueu.turmas.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurmaService {
    @Autowired
    private TurmaRepository turmaRepository;

    public Turma cadastrarTurma(Turma turma) {
        return turmaRepository.save(turma);
    }

    public List<Turma> listarTurmas() {
        return turmaRepository.findAll();
    }

    // outros métodos, como atualizarTurma, excluirTurma, etc.
}
