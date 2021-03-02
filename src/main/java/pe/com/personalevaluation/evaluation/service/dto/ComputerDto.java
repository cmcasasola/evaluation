package pe.com.personalevaluation.evaluation.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ComputerDto extends MachineDto {
    private String processor;
    private String ram;
    private String dimensions;
}
