package co.edu.icesieventos.mongo.controller;

import co.edu.icesieventos.mongo.repository.AttendantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("attendants")
public class AttendantResController {

    @Autowired
    AttendantRepository repository;

}