package co.edu.icesieventos.postgresql.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tipos_contratacion")
public class EmploymentType {

    @Id
    @Column(name = "nombre")
    private String name;

}
