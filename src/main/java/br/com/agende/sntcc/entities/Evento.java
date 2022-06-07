package br.com.agende.sntcc.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "evento")
public class Evento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "data_inicio")
    private LocalDateTime data;

    @JsonManagedReference
    @OneToMany(mappedBy = "evento", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<EventoTrilha> eventoTrilhas;

    public Evento() {
    }

    public Evento(Long id, String descricao, LocalDateTime data, List<EventoTrilha> eventoTrilhas) {
        this.id = id;
        this.descricao = descricao;
        this.data = data;
        this.eventoTrilhas = eventoTrilhas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public List<EventoTrilha> getEventoTrilhas() {
        return eventoTrilhas;
    }

    public void setEventoTrilhas(List<EventoTrilha> eventoTrilhas) {
        this.eventoTrilhas = eventoTrilhas;
    }
}
