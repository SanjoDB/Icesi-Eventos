package co.edu.icesieventos.postgresql.repository;

import co.edu.icesieventos.postgresql.domain.Program;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgramRepository extends JpaRepository<Program, Long> {



}