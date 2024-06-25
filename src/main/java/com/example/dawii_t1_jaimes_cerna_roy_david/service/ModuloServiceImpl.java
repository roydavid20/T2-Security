package com.example.dawii_t1_jaimes_cerna_roy_david.service;

import com.example.dawii_t1_jaimes_cerna_roy_david.Entities.Modulo;
import com.example.dawii_t1_jaimes_cerna_roy_david.repositorios.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class ModuloServiceImpl extends BaseServiceImpl<Modulo, Long> implements ModuloService {
  public ModuloServiceImpl(BaseRepository<Modulo, Long> baseRepository) {
    super(baseRepository);
  }
}
