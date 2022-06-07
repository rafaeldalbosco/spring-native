package br.com.agende.sntcc.services;

import br.com.agende.sntcc.entities.Evento;

import java.util.List;

public interface EventoService {

    List<Evento> findAll();

    Evento findById(Long id);

    Evento save(Evento evento);

    void delete(Long id);
}
