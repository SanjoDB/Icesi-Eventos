package co.edu.icesieventos.postgresql.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "programas")
public class Program {

    @Id
    @Column(name = "codigo")
    private Integer code;

    @Column(name = "nombre")
    private String name;

    @ManyToOne
    @JoinColumn(name = "areas_codigo")
    private Area area;

}
