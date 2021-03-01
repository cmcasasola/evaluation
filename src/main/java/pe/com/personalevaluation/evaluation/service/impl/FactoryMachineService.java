package pe.com.personalevaluation.evaluation.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pe.com.personalevaluation.evaluation.service.MachineService;
import pe.com.personalevaluation.evaluation.service.dto.MachineType;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class FactoryMachineService {

    private final Map<MachineType, MachineService> serviceMap;

    public MachineService get(MachineType type) {
        return this.serviceMap.get(type);
    }
}
