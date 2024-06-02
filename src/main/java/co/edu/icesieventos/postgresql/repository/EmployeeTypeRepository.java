package co.edu.icesieventos.postgresql.repository;

import co.edu.icesieventos.postgresql.domain.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeTypeRepository extends JpaRepository<EmployeeType, Integer> {



}