package com.sousa.mardoqueu.turmas.service;

import com.sousa.mardoqueu.turmas.model.Turma;
import com.sousa.mardoqueu.turmas.repository.TurmaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class TurmaServiceTest {

    public static final int ID = 1;
    public static final String NOME = "Turma de Java";
    public static final String CURSO = "Java";

    public static final int INDEX = 0;


    LocalDate dataAtualEsperada = LocalDate.now();

    @InjectMocks
    private TurmaService turmaService;

    @Mock
    private TurmaRepository turmaRepository;

    private Turma turma;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        startTurma();
    }

    @Test
    void whenCadastrarTurmaThenReturnSucess() {
        when(turmaRepository.save(turma)).thenReturn(turma);

        Turma response = turmaService.cadastrarTurma(turma);

        assertEquals(NOME, response.getNome());
        assertEquals(CURSO, response.getCurso());
        assertEquals(dataAtualEsperada, response.getDataInicio());
        assertEquals(dataAtualEsperada, response.getDataEncerramento());

    }

    @Test
    void whenListarTurmasThenReturnSucess() {
        when(turmaRepository.findAll()).thenReturn(List.of(turma));

        List<Turma> response = turmaService.listarTurmas();

        assertNotNull(response);
        assertEquals(1, response.size());
        assertEquals(Turma.class, response.get(INDEX).getClass());

        assertEquals(ID, response.get(INDEX).getId());
        assertEquals(NOME, response.get(INDEX).getNome());
        assertEquals(CURSO, response.get(INDEX).getCurso());
        assertEquals(dataAtualEsperada, response.get(INDEX).getDataInicio());
        assertEquals(dataAtualEsperada, response.get(INDEX).getDataEncerramento());


    }

    private void startTurma(){

        turma = new Turma(ID, NOME, CURSO, dataAtualEsperada,  dataAtualEsperada);


    }

}