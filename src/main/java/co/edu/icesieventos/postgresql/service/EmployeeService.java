package co.edu.icesieventos.postgresql.service;

import co.edu.icesieventos.postgresql.dto.EmployeeDTO;

public interface EmployeeService{

    EmployeeDTO findById(String id) throws Exception;

}