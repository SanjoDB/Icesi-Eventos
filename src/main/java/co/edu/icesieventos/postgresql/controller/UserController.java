package co.edu.icesieventos.postgresql.controller;


import co.edu.icesieventos.postgresql.domain.User;
import co.edu.icesieventos.postgresql.dto.ProgramDTO;
import co.edu.icesieventos.postgresql.repository.UserRepository;
import co.edu.icesieventos.postgresql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping(path = "/getUser/{username}")
    public ResponseEntity<User> getUser(@PathVariable String username) {
        User user = userRepository.findUserByUsername(username);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
