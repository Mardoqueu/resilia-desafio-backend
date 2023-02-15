package com.sousa.mardoqueu.turmas;

import com.sousa.mardoqueu.turmas.repository.AlunoRepository;
import com.sousa.mardoqueu.turmas.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TurmasApplication {

	@Autowired
	AlunoRepository alunoRepository;

	@Autowired
	MatriculaRepository matriculaRepository;

	public static void main(String[] args) {
		SpringApplication.run(TurmasApplication.class, args);
	}

}
