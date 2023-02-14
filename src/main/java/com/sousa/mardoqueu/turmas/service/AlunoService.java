package com.sousa.mardoqueu.turmas.service;

import com.sousa.mardoqueu.turmas.model.Aluno;
import com.sousa.mardoqueu.turmas.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;

    public Aluno cadastrarAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public List<Aluno> listarAlunos() {
        return alunoRepository.findAll();
    }

    // outros métodos, como atualizarAluno, excluirAluno, etc.
}
