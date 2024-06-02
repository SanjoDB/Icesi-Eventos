package co.edu.icesieventos.mongo.domain;

import co.edu.icesieventos.postgresql.dto.FacultyDTO;
import co.edu.icesieventos.postgresql.dto.ProgramDTO;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Data
@Document(collection = "events")
public class Event {

    @Id
    private String id;

    private String title;

    private String description;

    private String[] categories;

    private LocalDate date;

    private Location location;

    private List<FacultyDTO> faculties;

    private List<ProgramDTO> programs;

    private List<Attendant> attendants;

    private List<Comment> comments;
    
}