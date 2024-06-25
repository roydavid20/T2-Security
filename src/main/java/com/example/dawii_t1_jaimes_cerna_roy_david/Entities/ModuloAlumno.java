package com.example.dawii_t1_jaimes_cerna_roy_david.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ModuloAlumno extends BaseEntity {



  @JsonIgnore
  @ManyToOne
  @JoinColumn(name = "codigo_alumno")
  private Alumno alumno;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "codigo_modulo")
  private Modulo modulo;
}
