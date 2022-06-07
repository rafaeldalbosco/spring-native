package br.com.agende.sntcc.controllers.impl;

import br.com.agende.sntcc.controllers.EventoController;
import br.com.agende.sntcc.entities.Evento;
import br.com.agende.sntcc.services.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/evento")
public class EventoControllerImpl implements EventoController {
    @Autowired private EventoService eventoService;

    @Override
    @GetMapping
    public List<Evento> findAll() {
        return eventoService.findAll();
    }

    @Override
    @GetMapping("/{id}")
    public Evento findById(@PathVariable("id") Long id) {
        return eventoService.findById(id);
    }

    @Override
    @PostMapping
    public Evento save(@RequestBody Evento evento) {
        if (evento.getEventoTrilhas() != null) {
            evento.getEventoTrilhas().forEach(eventoTrilha -> eventoTrilha.setEvento(evento));
        }
        return eventoService.save(evento);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        eventoService.delete(id);
    }
}
