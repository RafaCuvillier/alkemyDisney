package com.alkemy.disney.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="pelicula")
@Getter
@Setter
public class PeliculaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO.SEQUENCE)
    private Long id;
    private String imagen;
    private String titulo;
    private LocalDateTime fecha;
    private Integer calificacion;

    @ManyToMany(mappedBy = "peliculas")
    private Set<PersonajeEntity> personajeEntity = new HashSet<>();

    @JoinTable(name = "pelicula_genero",
            joinColumns = @JoinColumn(name = "pelicula_id"),
            inverseJoinColumns = @JoinColumn(name = "genero_id"))
    @ManyToMany
    private Set<GeneroEntity> generoEntity = new HashSet<>();
    

}
