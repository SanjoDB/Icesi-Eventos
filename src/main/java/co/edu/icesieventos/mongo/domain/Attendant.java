package co.edu.icesieventos.mongo.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "attendants")
public class Attendant {

    @Id
    private Integer id;

    private String username;

    private String firstName;

    private String lastName;

    private String relationship;

    private String email;

    private City city;

}
