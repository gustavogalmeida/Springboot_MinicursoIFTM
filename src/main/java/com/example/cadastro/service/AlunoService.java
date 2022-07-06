package com.example.cadastro.service;

import com.example.cadastro.controller.dto.AlunoDTO;
import com.example.cadastro.model.AlunoEntity;
import com.example.cadastro.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;
    public void salvar(AlunoDTO aluno) {
        AlunoEntity alunoEntity = AlunoEntity.builder()
                .nome(aluno.getNome())
                .telefone(aluno.getTelefone())
                .email(aluno.getEmail())
                .build();
        repository.save(alunoEntity);
    }
}
