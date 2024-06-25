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
public class Profesor {

  @Id
  @Column(name = "rfc", length = 15)
  private String rfc;

  @Column(name = "nombre", length = 25)
  private String nombre;

  @Column(name = "apellidoP", length = 25)
  private String apellidoP;

  @Column(name = "apellidoM", length = 25)
  private String apellidoM;

  @Column(name = "direccion", length = 25)
  private String direccion;

  @Column(length = 10, columnDefinition = "char(10)")
  private String telefono;

  @ManyToOne
  @JoinColumn(name = "codigo_modulo")
  private Modulo modulo;
}
