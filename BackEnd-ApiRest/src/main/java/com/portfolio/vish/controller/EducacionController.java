
package com.portfolio.vish.controller;

import com.portfolio.vish.model.Educacion;
import com.portfolio.vish.service.EducacionService;
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
@RequestMapping("/api/edu")
@CrossOrigin(origins = {"", "http://localhost:4200"})
@RequiredArgsConstructor
public class EducacionController {
    @Autowired
    private final EducacionService educationService;

    @GetMapping("/list")
    public ResponseEntity<List<Educacion>> getAllEducation(){
        List<Educacion> educations=educationService.findAllEducacion();
        return new ResponseEntity<>(educations, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Educacion> addEducation(@RequestBody Educacion educacion){
        Educacion newEducation=educationService.addEducacion(educacion);
        return new ResponseEntity<>(newEducation,HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Educacion> updateEducation(@RequestBody Educacion educacion){
        Educacion updateEducation=educationService.updateEducacion(educacion);
        return new ResponseEntity<>(updateEducation,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEducation(@PathVariable("id") Long id){
        educationService.deleteEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}