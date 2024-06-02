package co.edu.icesieventos.mongo.controller;

import co.edu.icesieventos.mongo.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("events")
public class EventRestController {

    @Autowired
    EventRepository repository;

}