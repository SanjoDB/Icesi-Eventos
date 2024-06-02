package co.edu.icesieventos.postgresql.mapper;

import co.edu.icesieventos.postgresql.domain.Faculty;
import co.edu.icesieventos.postgresql.dto.FacultyDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface FacultyMapper {

    FacultyDTO toFacultyDTO(Faculty entity);

    Faculty toFaculty(FacultyDTO entity);

    List<FacultyDTO> toFacultyDTO(List<Faculty> entity);

    List<Faculty> toFaculty(List<FacultyDTO> entity);

}