package pe.com.personalevaluation.evaluation.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import pe.com.personalevaluation.evaluation.service.dto.MachineDto;
import pe.com.personalevaluation.evaluation.service.impl.ManagerMachineService;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MachineController {
    private final ManagerMachineService managerMachineService;

    @PostMapping("/create")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Mono<MachineDto> save(@RequestBody MachineDto machine) {
        return this.managerMachineService.save(machine);
    }
}
