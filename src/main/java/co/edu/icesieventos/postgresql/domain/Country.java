package co.edu.icesieventos.postgresql.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "country")
public class Country {

    @Id
    @Column(name = "code")
    private Integer code;

    @Column(name = "name")
    private String name;

}
