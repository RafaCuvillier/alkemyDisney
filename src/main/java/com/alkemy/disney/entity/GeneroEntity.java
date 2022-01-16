package com.alkemy.disney.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "genero")
@Getter
@Setter
public class GeneroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO.SEQUENCE)
    private Long id;
    private String nombre;
    private String imagen;

    @ManyToMany(mappedBy = "genero")
    private Set<PeliculaEntity> peliculaEntity = new HashSet<>();
}
