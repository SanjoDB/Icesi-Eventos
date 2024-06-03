package co.edu.icesieventos.postgresql.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "empleados")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "identificacion")
    private String id;

    @Column(name = "nombres")
    private String firstName;

    @Column(name = "apellidos")
    private String lastName;

    @Column(name = "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "cod_facultad")
    private Faculty faculty;

    @ManyToOne
    @JoinColumn(name = "lugar_nacimiento")
    private City city;

    @ManyToOne
    @JoinColumn(name = "codigo_sede")
    private Headquarter headquarter;

    @ManyToOne
    @JoinColumn(name = "tipo_contratacion")
    private EmploymentType employmentType;

    @ManyToOne
    @JoinColumn(name = "tipo_empleado")
    private EmployeeType employeeType;

}