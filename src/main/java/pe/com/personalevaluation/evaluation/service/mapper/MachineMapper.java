package pe.com.personalevaluation.evaluation.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pe.com.personalevaluation.evaluation.entity.Computer;
import pe.com.personalevaluation.evaluation.entity.Machine;
import pe.com.personalevaluation.evaluation.entity.Notebook;
import pe.com.personalevaluation.evaluation.entity.Typewriter;
import pe.com.personalevaluation.evaluation.service.dto.ComputerDto;
import pe.com.personalevaluation.evaluation.service.dto.MachineDto;
import pe.com.personalevaluation.evaluation.service.dto.NotebookDto;
import pe.com.personalevaluation.evaluation.service.dto.TypewriterDto;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MachineMapper {

    Machine toEntity(MachineDto dto);
}
