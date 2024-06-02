package co.edu.icesieventos.postgresql.domain;

import co.edu.icesieventos.postgresql.domain.City;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usuarios")
public class User {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "relationship")
    private String relationship;

    @Column(name = "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "city")
    private City city;

}