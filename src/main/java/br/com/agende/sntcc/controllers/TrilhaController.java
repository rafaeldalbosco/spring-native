package br.com.agende.sntcc.controllers;

import br.com.agende.sntcc.entities.Trilha;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface TrilhaController {
    @GetMapping
    List<Trilha> findAll();

    @GetMapping("/{id}")
    Trilha findById(@PathVariable("id") Long id);

    @PostMapping
    Trilha save(@RequestBody Trilha Trilha);

    @DeleteMapping("/{id}")
    void delete(@PathVariable("id") Long id);
}
