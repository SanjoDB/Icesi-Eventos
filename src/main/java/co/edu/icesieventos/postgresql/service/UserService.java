package co.edu.icesieventos.postgresql.service;

import co.edu.icesieventos.postgresql.domain.User;
import co.edu.icesieventos.postgresql.dto.UserDTO;

public interface UserService extends GenericService<User, Integer> {

    String addUser(User user);


}
