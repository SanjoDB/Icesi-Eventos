package co.edu.icesieventos.postgresql.domain;

import co.edu.icesieventos.postgresql.domain.City;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usuarios")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "relationship")
    private String relationship;

    @Column(name = "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    public User(String username, String password, String role, String firstName, String lastName, String relationship, String email, City city) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.relationship = relationship;
        this.email = email;
        this.city = city;
    }

    public User() {

    }
}