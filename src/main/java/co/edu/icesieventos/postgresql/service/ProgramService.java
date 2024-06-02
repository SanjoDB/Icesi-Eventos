package co.edu.icesieventos.postgresql.service;

import co.edu.icesieventos.postgresql.dto.ProgramDTO;

import java.util.List;

public interface ProgramService {

    List<ProgramDTO> findAll();

}