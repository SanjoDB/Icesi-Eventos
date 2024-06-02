package co.edu.icesieventos.postgresql.service;

import co.edu.icesieventos.postgresql.dto.ProgramDTO;
import co.edu.icesieventos.postgresql.mapper.ProgramMapper;
import co.edu.icesieventos.postgresql.repository.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Scope("singleton")
@Service
public class ProgramServiceImpl implements ProgramService{

    @Autowired
    ProgramRepository repository;

    @Autowired
    ProgramMapper mapper;

    @Override
    public List<ProgramDTO> findAll() {

        List<ProgramDTO> lst = mapper.toProgramDTO(repository.findAll());

        return lst;

    }
}