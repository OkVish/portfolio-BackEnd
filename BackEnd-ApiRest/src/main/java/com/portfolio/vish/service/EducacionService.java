
package com.portfolio.vish.service;

import com.portfolio.vish.model.Educacion;
import com.portfolio.vish.repository.EducacionRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Vish
 */
@Service
@RequiredArgsConstructor
@Transactional
public class EducacionService {

    private final EducacionRepository educacionRepository;


    public Educacion addEducacion(Educacion educacion){
        return educacionRepository.save(educacion);
    }
    public Educacion updateEducacion(Educacion educacion){
        return educacionRepository.save(educacion);
    }
    public List<Educacion> findAllEducacion(){
        return educacionRepository.findAll();
    }
    public void deleteEducacion(Long id){
        educacionRepository.deleteById(id);
    }
}