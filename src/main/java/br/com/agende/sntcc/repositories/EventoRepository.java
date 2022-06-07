package br.com.agende.sntcc.repositories;

import br.com.agende.sntcc.entities.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {

}
