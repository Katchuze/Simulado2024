package com.example.simulado2024.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Imovel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(min=3, max=100, message="O endereço precisa ter entre 10 e 100 caracteres!")
    private String endereco;

    private Tipo tipo;

    @Min(value=1, message="O tamanho deve ser acima de zero!")
    private double tamano;

    @Min(value=0, message="O número de quertos deve ser de 0 ou acima!")
    private int numeroQuartos;

    private int numeroBanheiros;

    @Min(value=1, message="O valor deve ser acima de zero!")
    private double valor;

    private LocalDate dataCadastro;

    @ManyToOne
    private Proprietario proprietario;
}