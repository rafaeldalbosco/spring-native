package br.com.agende.sntcc.controllers.impl;

import br.com.agende.sntcc.controllers.TrilhaController;
import br.com.agende.sntcc.entities.Trilha;
import br.com.agende.sntcc.services.TrilhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trilha")
public class TrilhaControllerImpl implements TrilhaController {

    @Autowired private TrilhaService trilhaService;

    @Override
    @GetMapping
    public List<Trilha> findAll() {
        return trilhaService.findAll();
    }

    @Override
    @GetMapping("/{id}")
    public Trilha findById(@PathVariable Long id) {
        return trilhaService.findById(id);
    }

    @Override
    @PostMapping
    public Trilha save(@RequestBody Trilha Trilha) {
        return trilhaService.save(Trilha);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        trilhaService.delete(id);
    }
}
