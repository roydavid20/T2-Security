package com.example.dawii_t1_jaimes_cerna_roy_david.service;

import com.example.dawii_t1_jaimes_cerna_roy_david.Entities.Alumno;
import com.example.dawii_t1_jaimes_cerna_roy_david.repositorios.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class AlumnoServiceImpl extends BaseServiceImpl<Alumno, Long> implements AlumnoService {
  public AlumnoServiceImpl(BaseRepository<Alumno, Long> baseRepository) {super(baseRepository);}
}
