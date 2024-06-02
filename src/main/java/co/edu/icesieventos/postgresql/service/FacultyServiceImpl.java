package co.edu.icesieventos.postgresql.service;

import co.edu.icesieventos.postgresql.dto.FacultyDTO;
import co.edu.icesieventos.postgresql.mapper.FacultyMapper;
import co.edu.icesieventos.postgresql.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Scope("singleton")
@Service
public class FacultyServiceImpl implements FacultyService{

    @Autowired
    FacultyRepository repository;

    @Autowired
    FacultyMapper mapper;

    @Override
    public List<FacultyDTO> findAll() {

        List<FacultyDTO> lst = mapper.toFacultyDTO(repository.findAll());

        return lst;

    }

}