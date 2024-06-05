package co.edu.icesieventos.mongo.repository;

import co.edu.icesieventos.mongo.domain.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends MongoRepository<Comment, String> {



}