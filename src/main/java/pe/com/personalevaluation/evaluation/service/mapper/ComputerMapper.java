package pe.com.personalevaluation.evaluation.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pe.com.personalevaluation.evaluation.entity.Computer;
import pe.com.personalevaluation.evaluation.service.dto.ComputerDto;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ComputerMapper extends ParentMapper {

    Computer toEntity(ComputerDto dto);

    ComputerDto toDto(Computer entity);
}
