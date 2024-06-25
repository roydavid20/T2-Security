package com.example.dawii_t1_jaimes_cerna_roy_david.Controller;

import com.example.dawii_t1_jaimes_cerna_roy_david.Entities.ModuloAlumno;
import com.example.dawii_t1_jaimes_cerna_roy_david.service.ModuloAlumnoServiceImpl;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/modulo_alumno")
@PreAuthorize("isAuthenticated()")
public class ModuloAlumnoController extends BaseControllerImpl<ModuloAlumno, ModuloAlumnoServiceImpl> {
}
