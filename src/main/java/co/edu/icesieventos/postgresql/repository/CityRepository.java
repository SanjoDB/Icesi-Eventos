package co.edu.icesieventos.postgresql.repository;

import co.edu.icesieventos.postgresql.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {



}