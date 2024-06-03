package co.edu.icesieventos.postgresql.service;


import co.edu.icesieventos.postgresql.domain.City;
import co.edu.icesieventos.postgresql.domain.User;
import co.edu.icesieventos.postgresql.dto.UserDTO;
import co.edu.icesieventos.postgresql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Scope("singleton")
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public String addUser(User user) {
        City city = new City(user.getCity().getCode());
        User user1 = new User(user.getUsername(),user.getPassword(),"Viewer",user.getFirstName(),user.getLastName(),
                user.getRelationship(),user.getEmail(),city);
        userRepository.save(user1);
        return "El usuario se registro con exito";
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public Optional<User> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public User save(User entity) throws Exception {
        return userRepository.save(entity);
    }

    @Override
    public User update(User entity) throws Exception {
        return null;
    }

    @Override
    public void delete(User entity) throws Exception {

    }

    @Override
    public void deleteById(Integer integer) throws Exception {

    }

    @Override
    public void validate(User entity) throws Exception {

    }

    @Override
    public Long count() {
        return null;
    }
}
