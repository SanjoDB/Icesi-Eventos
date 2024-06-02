package co.edu.icesieventos.postgresql.repository;

import co.edu.icesieventos.postgresql.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {



}