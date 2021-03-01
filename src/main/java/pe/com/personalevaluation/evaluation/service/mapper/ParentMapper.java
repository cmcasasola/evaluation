package pe.com.personalevaluation.evaluation.service.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import pe.com.personalevaluation.evaluation.entity.Machine;
import pe.com.personalevaluation.evaluation.service.dto.ComputerDto;
import pe.com.personalevaluation.evaluation.service.dto.MachineDto;

public interface ParentMapper {

    @AfterMapping
    default Machine toEntity(ComputerDto dto, @MappingTarget Machine entity) {
        MachineMapper machineMapper = Mappers.getMapper(MachineMapper.class);
        return machineMapper.toEntity(dto);
    }
}
