package co.edu.icesieventos.postgresql.service;

import co.edu.icesieventos.postgresql.dto.FacultyDTO;

import java.util.List;

public interface FacultyService {

    List<FacultyDTO> findAll();

}