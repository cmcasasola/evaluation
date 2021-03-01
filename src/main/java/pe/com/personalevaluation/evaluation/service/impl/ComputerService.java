package pe.com.personalevaluation.evaluation.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.com.personalevaluation.evaluation.repository.ComputerRepository;
import pe.com.personalevaluation.evaluation.service.MachineService;
import pe.com.personalevaluation.evaluation.service.dto.ComputerDto;
import pe.com.personalevaluation.evaluation.service.mapper.ComputerMapper;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ComputerService implements MachineService<ComputerDto> {

    private final ComputerMapper mapper;
    private final ComputerRepository repository;

    @Override
    public Mono<ComputerDto> save(ComputerDto dto) {
        return this.repository.save(this.mapper.toEntity(dto))
                .map(computer -> this.mapper.toDto(computer));
    }

    @Override
    public Mono<ComputerDto> readAll() {
        return null;
    }
}
