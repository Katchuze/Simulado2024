package com.example.simulado2024.controller;

import com.example.simulado2024.entity.Imovel;
import com.example.simulado2024.service.ImovelService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("imovel")
public class ImovelController {

    @Autowired
    ImovelService imovelService;

    @PostMapping("cadastrar")
    public String cadastrarImovel(@RequestBody @Valid Imovel imovel){
        imovelService.cadastrarImovel(imovel);
        return "Imovel cadastrado com sucesso!";
    }
}
