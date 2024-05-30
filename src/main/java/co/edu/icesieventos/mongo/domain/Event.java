package co.edu.icesieventos.mongo.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "events")
public class Event {

    @Id
    private String title;

    private String description;

    private String categories;

    private Date date;

    private Location location;

    //attendants
    //faculties
    //comments

}
