package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Trabalho;

public interface TrabalhoRepository extends JpaRepository<Trabalho, Long> {

    @Query("select t from Trabalho t where t.nota > ?2 and t.titulo like %?1%") //2
    // like %valor% me traz todos os registros que cotenham esse valor

    public Optional<Trabalho> getByTitulo(String titulo, Integer nota); //1

}