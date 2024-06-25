package com.example.dawii_t1_jaimes_cerna_roy_david.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Alumno  extends  BaseEntity{



  private String nombre;
  private String apellidoP;
  private String apellidoM;
  private Date fechaNac;
  private boolean delegado;

  @OneToMany(mappedBy = "alumno", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<ModuloAlumno> moduloAlumnos;
}
