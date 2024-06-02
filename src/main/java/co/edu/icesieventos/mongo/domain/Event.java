package co.edu.icesieventos.mongo.domain;

import co.edu.icesieventos.postgresql.dto.FacultyDTO;
import co.edu.icesieventos.postgresql.dto.ProgramDTO;
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

    private String[] categories;

    private Date date;

    private Location location;

    private FacultyDTO[] faculties;

    private ProgramDTO[] programs;

    private Attendant[] attendants;

    private Comment[] comments;
    
}