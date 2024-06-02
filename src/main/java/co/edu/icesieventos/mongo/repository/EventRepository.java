package co.edu.icesieventos.mongo.repository;

import co.edu.icesieventos.mongo.domain.Event;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventRepository extends MongoRepository<Event, String> {



}