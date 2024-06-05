package co.edu.icesieventos.mongo.controller;

import co.edu.icesieventos.mongo.Service.EventService;
import co.edu.icesieventos.mongo.domain.Attendant;
import co.edu.icesieventos.mongo.domain.Event;
import co.edu.icesieventos.mongo.repository.EventRepository;
import co.edu.icesieventos.postgresql.domain.Faculty;
import co.edu.icesieventos.postgresql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("events")
public class EventRestController {

    @Autowired
    EventRepository repository;

    @Autowired
    EventService service;

    @Autowired
    UserService userService;
    @GetMapping(path = "/getEvent")
    public ResponseEntity<List<Event>> getAllEvents() {
        List<Event> events = service.findAll();
        return new ResponseEntity<>(events, HttpStatus.OK);
    }

    @GetMapping(path = "/getEvent/{id}")
    public ResponseEntity<Event> getEventById(@PathVariable String id) {
        Optional<Event> event = service.findById(id);
        return event.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping(path = "/createEvent")
    public ResponseEntity createEvent(@RequestBody Event event) {
        repository.save(event);
        return new ResponseEntity(event,HttpStatus.CREATED);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Event>> getEventsByUserId(@PathVariable("userId") String userId) {
        List<Event> events = service.findEventsByUserId(userId);
        return new ResponseEntity<>(events, HttpStatus.OK);
    }

    @PostMapping(path = "/register/{eventId}")
    public Event registerAttendant(@PathVariable("eventId") String eventId, @RequestBody Attendant attendant){
        Optional<Event> eventOptional = service.findById(eventId);
        if (eventOptional.isPresent()) {
            Event event = eventOptional.get();
            event.getAttendants().add(attendant);
            service.update(event);
            return event;
        } else {
            throw new RuntimeException("Event not found with id " + eventId);
        }
    }
}