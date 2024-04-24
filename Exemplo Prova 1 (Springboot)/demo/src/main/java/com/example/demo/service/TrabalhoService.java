package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Trabalho;
import com.example.demo.repository.TrabalhoRepository;

@Service
public class TrabalhoService {
    @Autowired
    private TrabalhoRepository trabalhoRepo;

    public Trabalho cadastro(Trabalho Cadastro) {
        trabalhoRepo.save(Cadastro);
        return Cadastro;
    }

    // listar todos os registros da tabela
    public List<Trabalho> registro() {
        return trabalhoRepo.findAll();
    }

    public Optional<Trabalho> encontrarID(Long NumeroID) { // Tipo SEMPRE primeiro
        return trabalhoRepo.findById(NumeroID);
    }

}
