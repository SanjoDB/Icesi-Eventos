package co.edu.icesieventos.postgresql.dto;

import lombok.Data;

@Data
public class EmployeeDTO {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String faculty;
    private String city;
    private String headquarter;
    private String employmentType;
    private String employeeType;

}
