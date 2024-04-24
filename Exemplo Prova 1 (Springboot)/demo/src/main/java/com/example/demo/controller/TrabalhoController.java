package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Trabalho;
import com.example.demo.service.TrabalhoService;

@RestController
@RequestMapping(value = "/trabalho")
@CrossOrigin

public class TrabalhoController {

    @Autowired
    private TrabalhoService service;

    @GetMapping
    public List<Trabalho> registro() {
        return service.registro();
    }

    @PostMapping
    public Trabalho novo(@RequestBody Trabalho cadastro) {
        return service.cadastro(cadastro);
    }

    @GetMapping(value = "/{id}")
    public Optional<Trabalho> encontrarID(@PathVariable("id") Long id) {
        return service.encontrarID(id);
    }

}
