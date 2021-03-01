package pe.com.personalevaluation.evaluation.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Computer extends Machine{
    private String processor;
    private String ram;
    private String dimensions;
}
