package co.edu.icesieventos.postgresql.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "ciudades")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Integer code;

    @Column(name = "nombre")
    private String name;

    @ManyToOne
    @JoinColumn(name = "cod_dpto")
    private Department department;

    public City(Integer codigo) {
        this.code = codigo;
    }


    public City() {

    }
}
