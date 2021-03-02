package pe.com.personalevaluation.evaluation.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pe.com.personalevaluation.evaluation.repository.ComputerRepository;
import pe.com.personalevaluation.evaluation.service.MachineService;
import pe.com.personalevaluation.evaluation.service.dto.ComputerDto;
import pe.com.personalevaluation.evaluation.service.mapper.ComputerMapper;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
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
    public Flux<ComputerDto> readAll() {
        return this.repository.findAll()
                .map(computer -> this.mapper.toDto(computer));
    }

    @Override
    public void print(ComputerDto dto) {
        try {
            //System.out.println(new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(dto));
            log.info(new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(dto));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
