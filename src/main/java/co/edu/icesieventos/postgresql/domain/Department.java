package co.edu.icesieventos.postgresql.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "department")
public class Department {

    @Id
    @Column(name = "code")
    private Integer code;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "countryCode")
    private Country country;

}
