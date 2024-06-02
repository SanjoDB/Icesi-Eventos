package co.edu.icesieventos.postgresql.repository;

import co.edu.icesieventos.postgresql.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {



}