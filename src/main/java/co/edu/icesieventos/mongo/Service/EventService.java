package co.edu.icesieventos.mongo.Service;

import co.edu.icesieventos.mongo.domain.Event;
import co.edu.icesieventos.mongo.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    EventRepository repository;

    public List<Event> findAll() {

        List<Event> lst = repository.findAll();

        return lst;

    }

}