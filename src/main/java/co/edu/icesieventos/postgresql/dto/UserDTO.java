package co.edu.icesieventos.postgresql.dto;

import co.edu.icesieventos.postgresql.domain.City;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class UserDTO {
    private String id;

    private String username;

    private String password;

    private String role;

    private String firstname;

    private String lastname;

    private String relationship;

    private String email;

    private City city;

    public UserDTO(String username, String password, String role, String firstname, String lastName, String relationship, String email, City city) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.firstname = firstname;
        this.lastname = lastName;
        this.relationship = relationship;
        this.email = email;
        this.city = city;
    }
}
