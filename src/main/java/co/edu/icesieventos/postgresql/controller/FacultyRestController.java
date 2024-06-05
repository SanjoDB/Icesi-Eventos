package co.edu.icesieventos.postgresql.controller;

import co.edu.icesieventos.postgresql.domain.Faculty;
import co.edu.icesieventos.postgresql.dto.FacultyDTO;
import co.edu.icesieventos.postgresql.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("faculties")
public class FacultyRestController {

    @Autowired
    FacultyService service;

    @GetMapping(path = "/getFaculty")
    public ResponseEntity<List<Faculty>> findAll() {
        List<Faculty> faculties = service.findAll();
        return new ResponseEntity<>(faculties, HttpStatus.OK);
    }

}