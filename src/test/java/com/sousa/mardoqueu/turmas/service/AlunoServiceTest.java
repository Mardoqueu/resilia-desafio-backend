package com.sousa.mardoqueu.turmas.service;

import com.sousa.mardoqueu.turmas.model.Aluno;
import com.sousa.mardoqueu.turmas.repository.AlunoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class AlunoServiceTest {

    public static final int ID = 1;
    public static final String NOME = "Mardoqueu Sousa Telvina";
    public static final String CPF = "123.456.789-00";
    public static final String EMAIL = "mardoqueu.sousa@example.com";
    @InjectMocks
    private AlunoService service;
    @Mock
    private AlunoRepository alunoRepository;

    private Aluno aluno;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        startAluno();
    }

    @Test
    void whenCadastrarAlunoThenReturnSucess() {
        when(alunoRepository.save(aluno)).thenReturn(aluno);

        Aluno alunoCadastrado = service.cadastrarAluno(aluno);

        assertEquals(NOME, alunoCadastrado.getNome());
        assertEquals(CPF, alunoCadastrado.getCpf());
        assertEquals(EMAIL, alunoCadastrado.getEmail());
    }

    @Test
    void listarAlunos() {
    }

    private void startAluno(){
        aluno = new Aluno(ID, NOME, CPF, EMAIL);
    }
}