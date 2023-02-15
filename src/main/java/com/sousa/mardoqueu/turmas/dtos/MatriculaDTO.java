package com.sousa.mardoqueu.turmas.dtos;

import java.io.Serializable;

public class MatriculaDTO  implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long turmaId;
    private Long alunoId;

    public Long getTurmaId() {
        return turmaId;
    }

    public void setTurmaId(Long turmaId) {
        this.turmaId = turmaId;
    }

    public Long getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Long alunoId) {
        this.alunoId = alunoId;
    }
}

