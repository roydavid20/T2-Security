package com.example.dawii_t1_jaimes_cerna_roy_david.service;

import com.example.dawii_t1_jaimes_cerna_roy_david.Entities.BaseEntity;

import java.io.Serializable;
import java.util.List;

public interface IBaseService <E extends BaseEntity, ID extends Serializable> {

  List<E> findAll() throws Exception;
  E findById(ID id) throws Exception;
  E save(E entity) throws Exception;
  E update(ID id, E entity) throws Exception;
  boolean delete(ID id) throws Exception;
}
