
package com.portfolio.vish.service;


import com.portfolio.vish.model.Skills;
import com.portfolio.vish.repository.SkillsRepository;
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
public class SkillsService {

    private final SkillsRepository skillsRepository;


    public Skills addSkills(Skills skills){
        return skillsRepository.save(skills);
    }
    public Skills updateSkills(Skills skills){
        return skillsRepository.save(skills);
    }
    public List<Skills> findAllSkills(){
        return skillsRepository.findAll();
    }
    public void deleteSkills(Long id){
        skillsRepository.deleteById(id);
    }
}