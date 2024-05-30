package co.edu.icesieventos.postgresql.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "program")
public class Program {

    @Id
    @Column(name = "code")
    private Integer code;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "areaCode")
    private Area area;

}
