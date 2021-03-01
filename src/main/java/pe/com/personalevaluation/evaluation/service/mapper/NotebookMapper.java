package pe.com.personalevaluation.evaluation.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pe.com.personalevaluation.evaluation.entity.Notebook;
import pe.com.personalevaluation.evaluation.service.dto.NotebookDto;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface NotebookMapper {

    Notebook toEntity(NotebookDto dto);

    NotebookDto toDto(Notebook entity);
}
