package co.edu.icesieventos.postgresql.controller;
import co.edu.icesieventos.postgresql.domain.User;
import co.edu.icesieventos.postgresql.dto.LoginDto;
import co.edu.icesieventos.postgresql.dto.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import co.edu.icesieventos.postgresql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:3000")
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


    @PostMapping(path = "/login")
    public String loginUser(@RequestBody LoginDto loginDto){

        String msg = userService.loginUser(loginDto);

        return msg;
    }

}