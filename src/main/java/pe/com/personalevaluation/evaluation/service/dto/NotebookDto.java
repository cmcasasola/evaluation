package pe.com.personalevaluation.evaluation.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class NotebookDto extends MachineDto {
    private String processor;
    private String ram;
    private String size;

    @Override
    public String toString() {
        return new StringBuilder().append("[processor: ").append(this.processor).append("], ")
                .append("[ram: ").append(this.ram).append("], ")
                .append("[size: ").append(this.size).append("] ")
                .toString();
    }
}
