package co.edu.icesieventos.postgresql.controller;
import co.edu.icesieventos.postgresql.domain.User;
import co.edu.icesieventos.postgresql.dto.UserDTO;
import org.springframework.web.bind.annotation.CrossOrigin;
import co.edu.icesieventos.postgresql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auth")
public class LoginController {

    @Autowired
    private UserService userService;


    @PostMapping(path = "/register")
    public String saverUser(@RequestBody User user){
        String msg =userService.addUser(user);
        return msg;
    }
}
