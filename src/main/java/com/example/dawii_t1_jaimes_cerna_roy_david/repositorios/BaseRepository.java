package com.example.dawii_t1_jaimes_cerna_roy_david.repositorios;

import com.example.dawii_t1_jaimes_cerna_roy_david.Entities.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository <E extends BaseEntity, ID extends Serializable> extends JpaRepository<E, ID> {
}
