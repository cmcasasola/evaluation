package pe.com.personalevaluation.evaluation.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public abstract class Machine {
    protected String mark;
    protected String model;
    protected String year;
    protected String colour;
    protected MachineType type;
}
