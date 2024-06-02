package co.edu.icesieventos.postgresql.mapper;

import co.edu.icesieventos.postgresql.domain.Employee;
import co.edu.icesieventos.postgresql.dto.EmployeeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    @Mapping(source = "faculty.name", target = "faculty")
    @Mapping(source = "city.name", target = "city")
    @Mapping(source = "headquarter.name", target = "headquarter")
    @Mapping(source = "employmentType.name", target = "employmentType")
    @Mapping(source = "employeeType.name", target = "employeeType")
    EmployeeDTO toEmployeeDTO(Employee entity);

    @Mapping(source = "faculty", target = "faculty.name")
    @Mapping(source = "city", target = "city.name")
    @Mapping(source = "headquarter", target = "headquarter.name")
    @Mapping(source = "employmentType", target = "employmentType.name")
    @Mapping(source = "employeeType", target = "employeeType.name")
    Employee toEmployee(EmployeeDTO entity);

    @Mapping(source = "faculty.name", target = "faculty")
    @Mapping(source = "city.name", target = "city")
    @Mapping(source = "headquarter.name", target = "headquarter")
    @Mapping(source = "employmentType.name", target = "employmentType")
    @Mapping(source = "employeeType.name", target = "employeeType")
    List<EmployeeDTO> toEmployeeDTO(List<Employee> entity);

    @Mapping(source = "faculty", target = "faculty.name")
    @Mapping(source = "city", target = "city.name")
    @Mapping(source = "headquarter", target = "headquarter.name")
    @Mapping(source = "employmentType", target = "employmentType.name")
    @Mapping(source = "employeeType", target = "employeeType.name")
    List<Employee> toEmployee(List<EmployeeDTO> entity);

}