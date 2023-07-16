package com.portfolio.vish.controller;

import com.portfolio.vish.model.Info;
import com.portfolio.vish.service.InfoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/info")
public class InfoController {
    private final InfoService infoService;

    @Autowired
    public InfoController(InfoService infoService) {
        this.infoService = infoService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Info>> getAllInfo() {
        List<Info> infoList = infoService.getAllInfo();
        return new ResponseEntity<>(infoList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Info> getInfoById(@PathVariable int id) {
        Optional<Info> info = infoService.getInfoById(id);
        return info.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/add")
    public ResponseEntity<Info> saveInfo(@Valid @RequestBody Info info) {
        Info savedInfo = infoService.saveInfo(info);
        return new ResponseEntity<>(savedInfo, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteInfo(@PathVariable int id) {
        infoService.deleteInfo(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
