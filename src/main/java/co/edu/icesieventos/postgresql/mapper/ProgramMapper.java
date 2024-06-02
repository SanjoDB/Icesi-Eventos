package co.edu.icesieventos.postgresql.mapper;

import co.edu.icesieventos.postgresql.domain.Faculty;
import co.edu.icesieventos.postgresql.domain.Program;
import co.edu.icesieventos.postgresql.dto.FacultyDTO;
import co.edu.icesieventos.postgresql.dto.ProgramDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface ProgramMapper {

    @Mapping(source = "area.code", target = "area")
    ProgramDTO toProgramDTO(Program entity);

    @Mapping(source = "area", target = "area.code")
    Program toProgram(ProgramDTO entity);

    @Mapping(source = "area.code", target = "area")
    List<ProgramDTO> toProgramDTO(List<Program> entity);

    @Mapping(source = "area", target = "area.code")
    List<Program> toProgram(List<ProgramDTO> entity);

}