package com.example.dawii_t1_jaimes_cerna_roy_david.repositorios;

import com.example.dawii_t1_jaimes_cerna_roy_david.Entities.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, String> {
}
