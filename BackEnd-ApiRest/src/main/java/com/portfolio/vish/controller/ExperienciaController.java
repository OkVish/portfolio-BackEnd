
package com.portfolio.vish.controller;

import com.portfolio.vish.model.Experiencia;
import com.portfolio.vish.service.ExperienciaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 *
 * @author Vish
 */
@RestController
@RequestMapping("/api/exp")
@CrossOrigin(origins = {"", "http://localhost:4200"})
@RequiredArgsConstructor
public class ExperienciaController {
    @Autowired
    private final ExperienciaService experienciaService;

    @GetMapping("/list")
    public ResponseEntity<List<Experiencia>> getAllExperiencia(){
        List<Experiencia> experiencias=experienciaService.findAllExperiencia();
        return new ResponseEntity<>(experiencias, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Experiencia> addExperiencia(@RequestBody Experiencia experiencia){
        Experiencia newExperiencia=experienciaService.addExperiencia(experiencia);
        return new ResponseEntity<>(newExperiencia,HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Experiencia> updateExperiencia(@RequestBody Experiencia experiencia){
        Experiencia updateExperiencia=experienciaService.updateExperiencia(experiencia);
        return new ResponseEntity<>(updateExperiencia,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteExperiencia(@PathVariable("id") Long id){
        experienciaService.deleteExperiencia(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}