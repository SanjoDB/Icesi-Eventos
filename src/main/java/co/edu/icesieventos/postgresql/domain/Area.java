package co.edu.icesieventos.postgresql.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "area")
public class Area {

    @Id
    @Column(name = "code")
    private Integer code;

    @Column(name = "name")
    private String name;

    @Column(name = "facultyCode")
    private Integer facultyCode;

    @Column(name = "coordinatorId")
    private String coordinatorId;

}
