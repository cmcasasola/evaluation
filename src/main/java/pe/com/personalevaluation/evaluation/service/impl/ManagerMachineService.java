package pe.com.personalevaluation.evaluation.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.com.personalevaluation.evaluation.service.MachineService;
import pe.com.personalevaluation.evaluation.service.dto.MachineDto;
import pe.com.personalevaluation.evaluation.service.dto.MachineType;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ManagerMachineService {
    private final FactoryMachineService factoryMachineService;

    public Mono<MachineDto> save(MachineDto machineDto) {
        MachineService machineService = this.factoryMachineService.get(machineDto.getType());
        return machineService.save(machineDto);
    }

    public void read() {

        for (MachineType machineType : MachineType.values()) {
            MachineService machineService = this.factoryMachineService.get(machineType);

            machineService.readAll()
                    .doOnNext(machine -> machineService.print((MachineDto) machine))
                    .subscribe();
        }
    }
}
