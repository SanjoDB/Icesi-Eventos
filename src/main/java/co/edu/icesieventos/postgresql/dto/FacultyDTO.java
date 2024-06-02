package co.edu.icesieventos.postgresql.dto;

import lombok.Data;

@Data
public class FacultyDTO {

    private Integer code;
    private String name;
    private String location;
    private String phoneNumber;
    private String dean;

}