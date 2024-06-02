package co.edu.icesieventos.postgresql.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "departamentos")
public class Department {

    @Id
    @Column(name = "codigo")
    private Integer code;

    @Column(name = "nombre")
    private String name;

    @ManyToOne
    @JoinColumn(name = "cod_pais")
    private Country country;

}
