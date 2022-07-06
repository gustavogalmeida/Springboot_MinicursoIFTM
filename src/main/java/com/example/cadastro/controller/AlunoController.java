package com.example.cadastro.controller;

import com.example.cadastro.controller.dto.AlunoDTO;
import com.example.cadastro.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("aluno")
public class AlunoController {

    @Autowired
    private AlunoService service;

    @PostMapping
    private ResponseEntity<Object> salvar (@RequestBody AlunoDTO aluno){
        service.salvar(aluno);
        return ResponseEntity.ok("Aluno criado com sucesso");
    }
}
