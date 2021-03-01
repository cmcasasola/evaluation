package pe.com.personalevaluation.evaluation.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.com.personalevaluation.evaluation.repository.TypewriterRepository;
import pe.com.personalevaluation.evaluation.service.MachineService;
import pe.com.personalevaluation.evaluation.service.dto.TypewriterDto;
import pe.com.personalevaluation.evaluation.service.mapper.TypewriterMapper;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class TypewriterService implements MachineService<TypewriterDto> {

    private final TypewriterMapper mapper;
    private final TypewriterRepository repository;

    @Override
    public Mono<TypewriterDto> save(TypewriterDto dto) {
        return this.repository.save(this.mapper.toEntity(dto))
                .map(computer -> this.mapper.toDto(computer));
    }

    @Override
    public Mono<TypewriterDto> readAll() {
        return null;
    }
}
