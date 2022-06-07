package br.com.agende.sntcc.services;

import br.com.agende.sntcc.entities.Trilha;

import java.util.List;

public interface TrilhaService {

    List<Trilha> findAll();

    Trilha findById(Long id);

    Trilha save(Trilha trilha);

    void delete(Long id);
}
