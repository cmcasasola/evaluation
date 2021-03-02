package pe.com.personalevaluation.evaluation.service;

import pe.com.personalevaluation.evaluation.service.dto.MachineDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MachineService<T extends MachineDto> {

    Mono<T> save(T dto);
    Flux<T> readAll();
    void print(T dto);
}
