package co.edu.icesieventos.postgresql.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "paises")
public class Country {

    @Id
    @Column(name = "codigo")
    private Integer code;

    @Column(name = "nombre")
    private String name;

}
