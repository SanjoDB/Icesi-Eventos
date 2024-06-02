package co.edu.icesieventos.postgresql.controller;

import co.edu.icesieventos.postgresql.dto.FacultyDTO;
import co.edu.icesieventos.postgresql.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("faculties")
public class FacultyRestController {

    @Autowired
    FacultyService service;

    @GetMapping(path = "/all")
    public ResponseEntity<List<FacultyDTO>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

}