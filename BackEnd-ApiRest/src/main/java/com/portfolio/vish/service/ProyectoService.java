
package com.portfolio.vish.service;

import com.portfolio.vish.model.Proyecto;
import com.portfolio.vish.repository.ProyectoRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Vish
 */
@Service
@Transactional
@RequiredArgsConstructor
public class ProyectoService {
  private final ProyectoRepository proyectoRespository;

    public Proyecto addProyecto(Proyecto proyecto){
        return proyectoRespository.save(proyecto);
    }
    public Proyecto updateProyecto(Proyecto proyecto){
        return proyectoRespository.save(proyecto);
    }
    public List<Proyecto> findAllProyectos(){
        return proyectoRespository.findAll();
    }
    public void deleteProyecto(Long id){
        proyectoRespository.deleteById(id);
    }
}