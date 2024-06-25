package com.example.dawii_t1_jaimes_cerna_roy_david.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Modulo extends BaseEntity {



  @Column(name = "nombre", length = 45)
  private String nombre;

  @ManyToOne
  @JoinColumn(name = "rfc_profesor")
  private Profesor profesor;

  @OneToMany(mappedBy = "modulo", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
  private List<ModuloAlumno> moduloAlumnos;

}
