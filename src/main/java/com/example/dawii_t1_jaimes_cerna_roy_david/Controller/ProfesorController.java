package com.example.dawii_t1_jaimes_cerna_roy_david.Controller;


import com.example.dawii_t1_jaimes_cerna_roy_david.Entities.Profesor;
import com.example.dawii_t1_jaimes_cerna_roy_david.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/profesor")
@PreAuthorize("isAuthenticated()")
public class ProfesorController {

  @Autowired
  private ProfesorService profesorService;

  @GetMapping("")
  public ResponseEntity getAll() {
    try {
      return ResponseEntity.status(HttpStatus.OK).body(profesorService.findAll());
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");
    }
  }

  @GetMapping("/{id}")
  public ResponseEntity getOne(@PathVariable String id) {
    try {
      return ResponseEntity.status(HttpStatus.OK).body(profesorService.findById(id));
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");
    }
  }

  @PostMapping("")
  public ResponseEntity save(Profesor profesor) {
    try {
      return ResponseEntity.status(HttpStatus.CREATED).body(profesorService.save(profesor));
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");
    }
  }

  @PutMapping("/{id}")
  public ResponseEntity update(@PathVariable String id, @RequestBody Profesor profesor) {
    try {
      return ResponseEntity.status(HttpStatus.OK).body(profesorService.update(id, profesor));
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");
    }
  }

  @DeleteMapping("/{id}")
  public ResponseEntity delete(@PathVariable String id) {
    try {
      return ResponseEntity.status(HttpStatus.NO_CONTENT).body(profesorService.delete(id));
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");
    }
  }
}
