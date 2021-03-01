package pe.com.personalevaluation.evaluation.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pe.com.personalevaluation.evaluation.entity.Typewriter;
import pe.com.personalevaluation.evaluation.service.dto.TypewriterDto;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TypewriterMapper {

    Typewriter toEntity(TypewriterDto dto);

    TypewriterDto toDto(Typewriter entity);
}
