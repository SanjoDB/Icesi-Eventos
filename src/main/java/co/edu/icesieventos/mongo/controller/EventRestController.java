package co.edu.icesieventos.mongo.controller;

import co.edu.icesieventos.mongo.Service.EventService;
import co.edu.icesieventos.mongo.domain.Event;
import co.edu.icesieventos.mongo.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("events")
public class EventRestController {

    @Autowired
    EventRepository repository;

    @Autowired
    EventService service;

    @GetMapping(path = "/getEvent")
    public ResponseEntity<List<Event>> getAllEvents() {
        List<Event> events = service.findAll();
        return new ResponseEntity<>(events, HttpStatus.OK);
    }

}