package co.edu.icesieventos.mongo.repository;

import co.edu.icesieventos.mongo.domain.Event;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends MongoRepository<Event, String> {

    List<Event> findAll();


}