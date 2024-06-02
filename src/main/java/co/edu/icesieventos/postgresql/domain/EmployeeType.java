package co.edu.icesieventos.postgresql.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tipos_empleados")
public class EmployeeType {

    @Id
    @Column(name = "nombre")
    private String name;

}
