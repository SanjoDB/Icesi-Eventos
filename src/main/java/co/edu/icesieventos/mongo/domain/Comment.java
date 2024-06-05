package co.edu.icesieventos.mongo.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
public class Comment {

    @Id
    private Integer id;

    private String text;

    private String author;

    public Comment(String text, String author) {
        this.text = text;
        this.author = author;
    }
}