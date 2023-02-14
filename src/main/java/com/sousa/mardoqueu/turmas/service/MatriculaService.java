package com.sousa.mardoqueu.turmas.service;

import com.sousa.mardoqueu.turmas.model.Aluno;
import com.sousa.mardoqueu.turmas.model.Matricula;
import com.sousa.mardoqueu.turmas.model.Turma;
import com.sousa.mardoqueu.turmas.repository.AlunoRepository;
import com.sousa.mardoqueu.turmas.repository.MatriculaRepository;
import com.sousa.mardoqueu.turmas.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatriculaService {
    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private TurmaRepository turmaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    public Matricula matricularAluno(Long turmaId, Long alunoId) {
        Turma turma = turmaRepository.findById(turmaId).orElseThrow(() -> new RuntimeException("Turma não encontrada"));
        Aluno aluno = alunoRepository.findById(alunoId).orElseThrow(() -> new RuntimeException("Aluno não encontrado"));

        if (turma.getMatriculas().size() >= 20) {
            throw new RuntimeException("Turma lotada");
        }

        for (Matricula matricula : aluno.getMatriculas()) {
            if (matricula.getTurma().getDataInicio().isBefore(turma.getDataEncerramento()) &&
                    matricula.getTurma().getDataEncerramento().isAfter(turma.getDataInicio())) {
                throw new RuntimeException("Aluno já matriculado em outra turma nesse período");
            }
        }

        Matricula matricula = new Matricula();
        matricula.setTurma(turma);
        matricula.setAluno(aluno);
        return matriculaRepository.save(matricula);
    }

    // outros métodos, como desmatricularAluno, listarMatriculas, etc.
}

