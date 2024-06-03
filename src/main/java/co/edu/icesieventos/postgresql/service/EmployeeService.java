package co.edu.icesieventos.postgresql.service;

import co.edu.icesieventos.postgresql.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService{

    List<EmployeeDTO> findAll();

    EmployeeDTO findById(String id) throws Exception;

}