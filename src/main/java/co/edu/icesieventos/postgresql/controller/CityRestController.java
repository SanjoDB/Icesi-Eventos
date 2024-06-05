package co.edu.icesieventos.postgresql.controller;

import co.edu.icesieventos.postgresql.domain.City;
import co.edu.icesieventos.postgresql.repository.CityRepository;
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
@RequestMapping("cities")
public class CityRestController {

    @Autowired
    CityRepository repository;

    @GetMapping(path = "/getCity")
    public ResponseEntity<List<City>> findAll() {
        List<City> cities = repository.findAll();
        return new ResponseEntity<>(cities, HttpStatus.OK);
    }

}