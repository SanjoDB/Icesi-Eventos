package co.edu.icesieventos.postgresql.repository;

import co.edu.icesieventos.postgresql.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Employee findById(String id) throws Exception;

}