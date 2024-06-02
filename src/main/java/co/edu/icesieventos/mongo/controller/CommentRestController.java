package co.edu.icesieventos.mongo.controller;

import co.edu.icesieventos.mongo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("comments")
public class CommentRestController {

    @Autowired
    CommentRepository repository;

}