package pe.com.personalevaluation.evaluation.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.com.personalevaluation.evaluation.repository.NotebookRepository;
import pe.com.personalevaluation.evaluation.service.MachineService;
import pe.com.personalevaluation.evaluation.service.dto.NotebookDto;
import pe.com.personalevaluation.evaluation.service.mapper.NotebookMapper;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class NotebookService implements MachineService<NotebookDto> {

    private final NotebookMapper mapper;
    private final NotebookRepository repository;

    @Override
    public Mono<NotebookDto> save(NotebookDto dto) {
        return this.repository.save(this.mapper.toEntity(dto))
                .map(computer -> this.mapper.toDto(computer));
    }

    @Override
    public Mono<NotebookDto> readAll() {
        return null;
    }
}
