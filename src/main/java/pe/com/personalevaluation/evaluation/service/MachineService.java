package pe.com.personalevaluation.evaluation.service;

import pe.com.personalevaluation.evaluation.service.dto.MachineDto;
import reactor.core.publisher.Mono;

public interface MachineService<T extends MachineDto> {

    Mono<T> save(T dto);
    Mono<T> readAll();
}
