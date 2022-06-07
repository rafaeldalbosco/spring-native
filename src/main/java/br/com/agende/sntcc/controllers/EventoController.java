package br.com.agende.sntcc.controllers;

import br.com.agende.sntcc.entities.Evento;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface EventoController {
    @GetMapping
    List<Evento> findAll();

    @GetMapping("/{id}")
    Evento findById(@PathVariable("id") Long id);

    @PostMapping
    Evento save(@RequestBody Evento evento);

    @DeleteMapping("/{id}")
    void delete(@PathVariable("id") Long id);
}
