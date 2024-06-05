package co.edu.icesieventos.postgresql.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "facultades")
public class Faculty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Integer code;

    @Column(name = "nombre")
    private String name;

    @Column(name = "ubicacion")
    private String location;

    @Column(name = "nro_telefono")
    private String phoneNumber;

    @Column(name = "id_decano")
    private String dean;

    public Faculty(Integer code) {
        this.code = code;
    }

    public Faculty() {

    }
}
