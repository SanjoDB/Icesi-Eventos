package co.edu.icesieventos.mongo.repository;

import co.edu.icesieventos.mongo.domain.Attendant;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AttendantRepository extends MongoRepository<Attendant, String> {



}