package co.edu.icesieventos.postgresql.service;

import co.edu.icesieventos.postgresql.domain.Employee;
import co.edu.icesieventos.postgresql.dto.EmployeeDTO;
import co.edu.icesieventos.postgresql.mapper.EmployeeMapper;
import co.edu.icesieventos.postgresql.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope("singleton")
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository repository;

    @Autowired
    EmployeeMapper mapper;

    @Override
    public EmployeeDTO findById(String id) throws Exception {
        try{
            Employee employee = repository.findById(id);
            return mapper.toEmployeeDTO(employee);
        }catch (Exception e){
            throw new Exception("La entidad no existe");
        }
    }

}