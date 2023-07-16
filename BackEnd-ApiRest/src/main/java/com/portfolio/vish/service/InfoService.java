package com.portfolio.vish.service;

import com.portfolio.vish.model.Info;
import com.portfolio.vish.repository.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InfoService {
    private final InfoRepository infoRepository;

    @Autowired
    public InfoService(InfoRepository infoRepository) {
        this.infoRepository = infoRepository;
    }

    public List<Info> getAllInfo() {
        return (List<Info>) infoRepository.findAll();
    }

    public Optional<Info> getInfoById(int id) {
        return infoRepository.findById(id);
    }

    public Info saveInfo(Info info) {
        return infoRepository.save(info);
    }

    public void deleteInfo(int id) {
        infoRepository.deleteById(id);
    }
}
