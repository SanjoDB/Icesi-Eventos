package co.edu.icesieventos.mongo.repository;

import co.edu.icesieventos.mongo.domain.Event;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EventRepository extends MongoRepository<Event, String> {

    List<Event> findAll();

    Optional<Event> findById(String id);

    Event update(Event event);

}