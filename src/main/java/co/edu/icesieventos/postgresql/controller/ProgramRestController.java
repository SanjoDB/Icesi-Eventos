package co.edu.icesieventos.postgresql.controller;

import co.edu.icesieventos.postgresql.dto.ProgramDTO;
import co.edu.icesieventos.postgresql.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("programs")
public class ProgramRestController {

    @Autowired
    ProgramService service;

    @GetMapping(path = "/all")
    public ResponseEntity<List<ProgramDTO>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

}