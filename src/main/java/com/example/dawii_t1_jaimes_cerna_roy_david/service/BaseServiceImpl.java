package com.example.dawii_t1_jaimes_cerna_roy_david.service;

import com.example.dawii_t1_jaimes_cerna_roy_david.Entities.BaseEntity;
import com.example.dawii_t1_jaimes_cerna_roy_david.repositorios.BaseRepository;
import jakarta.transaction.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public class BaseServiceImpl <E extends BaseEntity, ID extends Serializable> implements IBaseService<E, ID>


{

  protected BaseRepository<E, ID> baseRepository;

  public BaseServiceImpl(BaseRepository<E, ID> baseRepository) {
    this.baseRepository = baseRepository;
  }

  @Override
  @Transactional
  public List<E> findAll() throws Exception {
    return baseRepository.findAll();
  }

  @Override
  @Transactional
  public E findById(ID id) throws Exception {
    return baseRepository.findById(id).get();
  }

  @Override
  @Transactional
  public E save(E entity) throws Exception {
    return baseRepository.save(entity);

  }

  @Override
  @Transactional
  public E update(ID id, E entity) throws Exception {
    Optional<E> entityOptional = baseRepository.findById(id);
    E entityToUpdate = entityOptional.get();
    return baseRepository.save(entity);
  }

  @Override
  @Transactional
  public boolean delete(ID id) throws Exception {
    if (baseRepository.existsById(id)) {
      baseRepository.deleteById(id);
      return true;
    } else {
      throw new Exception();
    }
  }
}
