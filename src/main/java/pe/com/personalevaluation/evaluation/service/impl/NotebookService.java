package pe.com.personalevaluation.evaluation.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cglib.core.ReflectUtils;
import org.springframework.stereotype.Service;
import pe.com.personalevaluation.evaluation.repository.NotebookRepository;
import pe.com.personalevaluation.evaluation.service.MachineService;
import pe.com.personalevaluation.evaluation.service.dto.NotebookDto;
import pe.com.personalevaluation.evaluation.service.mapper.NotebookMapper;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.stream.Collectors;

@Slf4j
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
    public Flux<NotebookDto> readAll() {
        return this.repository.findAll()
                .map(notebook -> this.mapper.toDto(notebook));
    }

    @Override
    public void print(NotebookDto dto) {
        String collect = Arrays.stream(ReflectUtils.getBeanProperties(dto.getClass()))
                .map(property -> new StringBuilder().append("[").append(property.getName()).append(": ")
                        .append(property.getValue(property.getDisplayName())).append("], ").toString()
                ).collect(Collectors.joining());

        //System.out.println(collect.substring(collect.length() - 2));
        log.info(collect.substring(collect.length() - 2));
    }
}
