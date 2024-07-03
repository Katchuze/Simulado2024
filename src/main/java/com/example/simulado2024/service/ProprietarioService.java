package com.example.simulado2024.service;

import com.example.simulado2024.entity.Proprietario;
import com.example.simulado2024.repository.ProprietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProprietarioService {

    @Autowired
    ProprietarioRepository proprietarioRepository;

    public Proprietario cadastrarProprietario(Proprietario proprietario) {
        return proprietarioRepository.save(proprietario);
    }
}
