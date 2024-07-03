package com.example.simulado2024.service;

import com.example.simulado2024.entity.Imovel;
import com.example.simulado2024.repository.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImovelService {

    @Autowired
    ImovelRepository imovelRepository;

    public Imovel cadastrarImovel(Imovel imovel) {return imovelRepository.save(imovel);}

    public List<Imovel> buscarImoveis(){
        return imovelRepository.findAll();
    }

    public Imovel atualizarImovel (Imovel imovel){return imovelRepository.save(imovel);}

    public void deletarImovel(Long id){
        imovelRepository.deleteById(id);
    }
}
