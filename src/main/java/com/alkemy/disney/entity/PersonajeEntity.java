package com.alkemy.disney.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="personaje")
@Getter
@Setter
public class PersonajeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO.SEQUENCE)
    private Long id;

    private String imagen;
    private String nombre;
    private Integer edad;
    private float peso;
    private String historia;

    @JoinTable(name = "personaje_pelicula",
            joinColumns = @JoinColumn(name = "personaje_id"),
            inverseJoinColumns = @JoinColumn(name = "pelicula_id"))

    @ManyToMany
    private Set<PeliculaEntity> peliculaEntitie = new HashSet<>();
}