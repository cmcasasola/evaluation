package pe.com.personalevaluation.evaluation.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cglib.core.ReflectUtils;
import org.springframework.stereotype.Service;
import pe.com.personalevaluation.evaluation.repository.TypewriterRepository;
import pe.com.personalevaluation.evaluation.service.MachineService;
import pe.com.personalevaluation.evaluation.service.dto.TypewriterDto;
import pe.com.personalevaluation.evaluation.service.mapper.TypewriterMapper;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.stream.Collectors;

@Slf4j
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
    public Flux<TypewriterDto> readAll() {
        return this.repository.findAll()
                .map(typewriter -> this.mapper.toDto(typewriter));
    }

    @Override
    public void print(TypewriterDto dto) {
        String collect = Arrays.stream(ReflectUtils.getBeanProperties(dto.getClass()))
                .map(property -> new StringBuilder().append("[").append(property.getName()).append(": ")
                        .append(property.getValue(property.getDisplayName())).append("]\n").toString()
                ).collect(Collectors.joining());

        //System.out.println(collect);
        log.info(collect);
    }
}
