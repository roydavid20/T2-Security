package com.example.dawii_t1_jaimes_cerna_roy_david.service;

import com.example.dawii_t1_jaimes_cerna_roy_david.Entities.ModuloAlumno;
import com.example.dawii_t1_jaimes_cerna_roy_david.repositorios.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class ModuloAlumnoServiceImpl extends BaseServiceImpl<ModuloAlumno, Long> implements ModuloAlumnoService {

  public ModuloAlumnoServiceImpl(BaseRepository<ModuloAlumno, Long> baseRepository) {
    super(baseRepository);
  }
}
