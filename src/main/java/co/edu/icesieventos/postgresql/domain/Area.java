package co.edu.icesieventos.postgresql.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "areas")
public class Area {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Integer code;

    @Column(name = "nombre")
    private String name;

    @Column(name = "facultades_codigo")
    private Integer facultyCode;

    @Column(name = "id_coordinador")
    private String coordinatorId;

}
