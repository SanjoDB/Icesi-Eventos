package co.edu.icesieventos.postgresql.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "facultyCode")
    private Faculty faculty;

    @ManyToOne
    @JoinColumn(name = "cityBirth")
    private City city;

    @ManyToOne
    @JoinColumn(name = "headquarterCode")
    private Headquarter headquarter;

    @ManyToOne
    @JoinColumn(name = "employmentType")
    private EmploymentType employmentType;

    @ManyToOne
    @JoinColumn(name = "employeeType")
    private EmployeeType employeeType;

}