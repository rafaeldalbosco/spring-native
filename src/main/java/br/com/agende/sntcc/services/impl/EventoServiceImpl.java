package br.com.agende.sntcc.services.impl;

import br.com.agende.sntcc.entities.Evento;
import br.com.agende.sntcc.repositories.EventoRepository;
import br.com.agende.sntcc.services.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoServiceImpl implements EventoService {

    @Autowired private EventoRepository eventoRepository;

    @Override
    public List<Evento> findAll() {
        return eventoRepository.findAll();
    }

    @Override
    public Evento findById(Long id) {
        return eventoRepository.findById(id).orElseThrow(() -> new RuntimeException("Evento não encontrado"));
    }

    @Override
    public Evento save(Evento evento) {
        return eventoRepository.save(evento);
    }

    @Override
    public void delete(Long id) {
        eventoRepository.deleteById(id);
    }
}
