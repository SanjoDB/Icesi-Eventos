package co.edu.icesieventos.postgresql.controller;

import co.edu.icesieventos.postgresql.dto.EmployeeDTO;
import co.edu.icesieventos.postgresql.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employees")
public class EmployeeRestController {

    @Autowired
    EmployeeService service;

    @GetMapping(path = "/findById")
    public ResponseEntity<EmployeeDTO> getEmployeeById(@RequestParam String id) throws Exception {
        return ResponseEntity.ok(service.findById(id));
    }

}