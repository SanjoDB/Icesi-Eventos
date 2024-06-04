package co.edu.icesieventos.postgresql.repository;

import co.edu.icesieventos.postgresql.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Integer> {


    User findUserByUsername(String username);

    User findUserByUsernameAndPassword(String username, String password);
}
