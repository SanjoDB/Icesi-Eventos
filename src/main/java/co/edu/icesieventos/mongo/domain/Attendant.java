package co.edu.icesieventos.mongo.domain;

import co.edu.icesieventos.postgresql.domain.User;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Attendant {

    @Id
    private String id;

    private User usuario;

    private String role;

}