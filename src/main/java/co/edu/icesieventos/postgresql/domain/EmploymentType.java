package co.edu.icesieventos.postgresql.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "employmentType")
public class EmploymentType {

    @Id
    @Column(name = "name")
    private String name;

}
