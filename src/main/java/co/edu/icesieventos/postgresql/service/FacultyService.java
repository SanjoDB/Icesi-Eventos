package co.edu.icesieventos.postgresql.service;

import co.edu.icesieventos.postgresql.domain.Faculty;
import co.edu.icesieventos.postgresql.dto.FacultyDTO;

import java.util.List;

public interface FacultyService {

    List<Faculty> findAll();

}