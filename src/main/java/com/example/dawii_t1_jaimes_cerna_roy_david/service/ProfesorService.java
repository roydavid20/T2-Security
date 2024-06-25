package com.example.dawii_t1_jaimes_cerna_roy_david.service;

import com.example.dawii_t1_jaimes_cerna_roy_david.Entities.Profesor;

import java.util.List;

public interface ProfesorService {

  List<Profesor> findAll() throws Exception;
  Profesor findById(String id) throws Exception;
  Profesor save(Profesor profesor) throws Exception;
  Profesor update(String id, Profesor profesor) throws Exception;
  boolean delete(String id) throws Exception;
}
