package br.com.agende.sntcc.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "evento_trilha")
public class EventoTrilha implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "trilha_id", nullable = false, foreignKey = @ForeignKey(name = "fk_evento_trilha_trilha"))
    private Trilha trilha;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "evento_id", nullable = false, foreignKey = @ForeignKey(name = "fk_evento_trilha_evento"))
    private Evento evento;

    public EventoTrilha() {
    }

    public EventoTrilha(Long id, Trilha trilha, Evento evento) {
        this.id = id;
        this.trilha = trilha;
        this.evento = evento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Trilha getTrilha() {
        return trilha;
    }

    public void setTrilha(Trilha trilha) {
        this.trilha = trilha;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
