package com.example.dawii_t1_jaimes_cerna_roy_david.service;

import com.example.dawii_t1_jaimes_cerna_roy_david.Entities.Profesor;
import com.example.dawii_t1_jaimes_cerna_roy_david.repositorios.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorServiceImpl implements ProfesorService {


  @Autowired
  private ProfesorRepository profesorRepository;

  @Override
  public List<Profesor> findAll() throws Exception {
    return profesorRepository.findAll();
  }

  @Override
  public Profesor findById(String id) throws Exception {
    return profesorRepository.findById(id).get();
  }

  @Override
  public Profesor save(Profesor profesor) throws Exception {
    return null;
  }

  @Override
  public Profesor update(String id, Profesor profesor) throws Exception {
    return null;
  }

  @Override
  public boolean delete(String id) throws Exception {
    return false;
  }
}
