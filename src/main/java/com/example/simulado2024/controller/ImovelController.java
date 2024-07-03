package com.example.simulado2024.controller;

import com.example.simulado2024.entity.Imovel;
import com.example.simulado2024.service.ImovelService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("buscar")
    public List<Imovel> buscarImoveis(){
        return imovelService.buscarImoveis();
    }

    @PutMapping("atualizar")
    public String atualizarImovel(@RequestBody @Valid Imovel imovel){
        imovelService.atualizarImovel(imovel);
        return "Imovel atualizado com sucesso!";
    }

    @DeleteMapping("deletar/{id}")
    public String deletarImovel(@PathVariable Long id){
        imovelService.deletarImovel(id);
        return "Não é possível deletar os dados do imovel!";
    }
}
