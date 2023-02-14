package com.sousa.mardoqueu.turmas.repository;

import com.sousa.mardoqueu.turmas.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}

