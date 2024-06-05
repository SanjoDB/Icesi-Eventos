package co.edu.icesieventos.mongo.repository;

import co.edu.icesieventos.mongo.domain.Event;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EventRepository extends MongoRepository<Event, String> {

    List<Event> findAll();

    Optional<Event> findById(String id);

    @Query(" {'attendants.usuario.username' : ?0}")
    List<Event> findByAttendantsUsuarioId(String userId);




}