package br.com.agende.sntcc.services.impl;

import br.com.agende.sntcc.entities.Trilha;
import br.com.agende.sntcc.repositories.TrilhaRepository;
import br.com.agende.sntcc.services.TrilhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrilhaServiceImpl implements TrilhaService {

    @Autowired private TrilhaRepository trilhaRepository;

    @Override
    public List<Trilha> findAll() {
        return trilhaRepository.findAll();
    }

    @Override
    public Trilha findById(Long id) {
        return trilhaRepository.findById(id).orElseThrow(() -> new RuntimeException("Trilha não encontrada"));
    }

    @Override
    public Trilha save(Trilha trilha) {
        return trilhaRepository.save(trilha);
    }

    @Override
    public void delete(Long id) {
        trilhaRepository.deleteById(id);
    }
}
