package co.edu.icesieventos.mongo.Service;

import co.edu.icesieventos.mongo.domain.Event;
import co.edu.icesieventos.mongo.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    EventRepository repository;

    public List<Event> findAll() {

        List<Event> lst = repository.findAll();

        return lst;

    }

    public Optional<Event> findById(String id){

        Optional<Event> lst = repository.findById(id);

        return lst;

    }

    public Event update(Event event) {

        return repository.save(event);

    }

}