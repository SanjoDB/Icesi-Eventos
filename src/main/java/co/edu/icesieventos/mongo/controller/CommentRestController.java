package co.edu.icesieventos.mongo.controller;

import co.edu.icesieventos.mongo.Service.EventService;
import co.edu.icesieventos.mongo.domain.Comment;
import co.edu.icesieventos.mongo.domain.Event;
import co.edu.icesieventos.mongo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("comments")
public class CommentRestController {

    @Autowired
    CommentRepository cRepository;

    @Autowired
    EventService eService;

    @PostMapping("/event/{id}")
    public Event addCommentToEvent(@PathVariable String id, @RequestBody Comment comment) {
        Optional<Event> eventOptional = eService.findById(id);
        if (eventOptional.isPresent()) {
            Event event = eventOptional.get();
            event.getComments().add(comment);
            eService.update(event);
            return event;
        } else {
            throw new RuntimeException("Event not found with id " + id);
        }
    }

}