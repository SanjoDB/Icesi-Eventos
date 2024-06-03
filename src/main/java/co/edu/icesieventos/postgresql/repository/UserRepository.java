package co.edu.icesieventos.postgresql.repository;

import co.edu.icesieventos.postgresql.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
