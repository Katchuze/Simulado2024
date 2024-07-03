package com.example.simulado2024.controller;

import com.example.simulado2024.entity.Proprietario;
import com.example.simulado2024.service.ProprietarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("proprietario")
public class ProprietarioController {

    @Autowired
    ProprietarioService proprietarioService;

    @PostMapping("cadastrar")
    public String cadastrarProprietario(@RequestBody @Valid Proprietario proprietario){
        proprietarioService.cadastrarProprietario(proprietario);
        return "Proprietario cadastrado com sucesso!";
    }
}
