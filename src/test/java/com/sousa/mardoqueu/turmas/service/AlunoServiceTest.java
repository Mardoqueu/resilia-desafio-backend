package com.sousa.mardoqueu.turmas.service;

import com.sousa.mardoqueu.turmas.model.Aluno;
import com.sousa.mardoqueu.turmas.repository.AlunoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class AlunoServiceTest {

    public static final int ID = 1;
    public static final String NOME = "Mardoqueu Sousa Telvina";
    public static final String CPF = "123.456.789-00";
    public static final String EMAIL = "mardoqueu.sousa@example.com";

    public static final int INDEX = 0;

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
    void whenListarAlunosThenReturnAListofAlunos() {
        when(alunoRepository.findAll()).thenReturn(List.of(aluno));

        List<Aluno> response = service.listarAlunos();

        assertNotNull(response);
        assertEquals(1, response.size());
        assertEquals(Aluno.class, response.get(INDEX).getClass());

        assertEquals(ID, response.get(INDEX).getId());
        assertEquals(NOME, response.get(INDEX).getNome());
        assertEquals(CPF, response.get(INDEX).getCpf());

    }

    private void startAluno(){
        aluno = new Aluno(ID, NOME, CPF, EMAIL);
    }
}